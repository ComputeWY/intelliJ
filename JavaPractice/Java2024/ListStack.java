package Java2024;
import Java0222.Node;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
public class ListStack <E> {
    private Node<E> top;
    private int size;
    public ListStack() {
        top = null;
        size = 0;
    }

    public int size() {return size;}
    public boolean isEmpty() {return size == 0;}



    public E peek() {
        if (isEmpty()) {throw new EmptyStackException();}
        return top.getItem();
    }


    public void push(E newItem) {
        Node newNode = new Node(newItem, top); // 새로운 노드를 생성하고
        top = newNode; // top을 새로운 노드로 업데이트
        size++; // 스택 크기 증가
    }

    public E pop() { //스택 pop 연산
        if (isEmpty()) throw new EmptyStackException();
        E topItem = top.getItem();
        top = top.getNext();
        size --;
        return topItem;
    }
}


