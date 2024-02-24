package Java2024;
import Java0222.Node;

import java.util.NoSuchElementException;
public class ListQueue <E> {
    private Node<E> front, rear;
    private int size;
    public ListQueue() {
        front = rear = null;
        size = 0;
    }

    public int size() {return size;}
    public boolean isEmpty() {return size() == 0;}


    public void add(E addItem) {
        Node newNode = new Node(addItem, null); // 올바른 변수 사용
        if (isEmpty()) {
            front = newNode; // 할당 연산자로 front를 업데이트
        } else {
            rear.setNext(newNode); // rear의 다음 노드를 새로운 노드로 설정
            rear = newNode; // rear를 새로운 노드로 업데이트
        }
        size++; // 스택 크기 증가
    }


    public E remove() {
        if (isEmpty()) {throw new NoSuchElementException();}

        E frontItem = front.getItem();
        front = front.getNext();
        if (isEmpty()) rear = null;
        size--;
        return frontItem;

    }
    }
