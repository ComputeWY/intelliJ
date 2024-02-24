package Java2024;
import java.util.Arrays;
import java.util.EmptyStackException;
public class ArrayStack <E> {
    private E s[];
    private int top; // 스택의 top 항목의 배열 원소 인덱스
    public ArrayStack() {
        s = (E[]) new Object[1] // 초기에 크기가 1인 배열 생성
        top = -1;
    }

    public int size() {return top+1;}
    public boolean isEmpth() {return (top == -1);}




    public E peek() {
        if (isEmpth()) throw new EmptyStackException();
        return s[top];
    }

    public class main {
        public static  void main(String[] args) {
            ArrayStack<String> stack = new ArrayStack<String>();
            stack.peek();
            stack.push("apple");
        }
    }

    public void push(E newItem) { //push 연산
        if (size() == s.length){
            resize(2*s.length);}
        s[++top] = newItem;
    }

    public E pop() {
        if (isEmpth()) {
            throw new EmptyStackException(); //underflow시 프로그램 정지
        }
        E item = s[top];
        s[top--] = null;

        if (size() > 0 && size() == s.length / 4) {
            reisze(s.length / 2);
        }
        return item;
    }

}