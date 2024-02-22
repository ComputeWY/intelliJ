package Java0222;
import java.util.NoSuchElementException;

public class ArrList  <E> {
    private E a[];
    private int size;
    public ArrList() {
        a = (E[]) new Object[1]; //a = (E[]) new Object[1];: 배열 a를 생성합니다.
        // 제네릭 배열은 직접적으로 생성할 수 없기 때문에 Object 배열로 초기화한 후, (E[])로 캐스팅합니다.
        // 이는 제네릭 배열 생성의 한계로, 컴파일러는 이를 경고로 알려줄 것입니다.
        size = 0;
    }

    public E peek(int k) {
        if (size == 0) {
            throw new NoSuchElementException(); //underflow 경우에 프로그램 정지
        }

        return a[k];
    }

    public void insertLast(E newItem) { //가장 뒤에 새 항목 삽입
        if (size == a.length ) {
            resize(2*a.length);
        }
        a[size++] = newItem;
    }

    public void insert(E newItem, int k) { //새 항목을 k번쨰 뒤에 삽입
        if (size == a.length) {
            resize(2*a.length);
        }
        for (int i = size-1; i>=k; i--) {
            a[i+1] = a[i];
        }
        a[k] = newItem;
        size++;
    }

    public void resize(int newSize){ // 배열의 크기 조정
        Object[] t = new Object[newSize]; //newSize 크기의 새로운 배열 t 생성
        for (int i = 0; i < size; i++){
            t[i] = a[i]; // 배열 s를 배열 t로 복사
        }
        a = (E[]) t; // 배열 t를 배열 s로
    }

    public E delete(int k) { //k번째 항목 삭제
        if(isEmpty()) throw new NoSuchElementException(); // underflow에 대해 프로그램 정지
        E item = a[k];
        for (int i = k; i < size; i++) {
            a[i] = a[i+1];
        }
        size--;

        if (size > 0 && size == a.length/4) {
            resize(a.length/2);
            return item;
        }
    }

}