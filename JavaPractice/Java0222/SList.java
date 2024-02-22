package Java0222;

import java.util.NoSuchElementException;
import Java0222.Node;
import Java0222.ArrList;

public class SList <E> {
    protected  Node head; // 연결 리스트의 첫 노드 가르킴
    private int size;
    public SList() { //연결 리스트 생성자

        head = null;
        size = 0;

    }
    //탐색, 삽입, 삭제연산을 위한 메소드 선언



public int search(E target) {// target을 탐색
    Node p = head;
    for (int k = 0; k < size; k++) {
        if (target == p.getItem()) {
            return k;
        }
        p = p.getNext();
    }

    return -1; //탐색을 실패한 경우 -1 리턴
}

public void insertFront(E newItem) {// 연결리스트 맨 앞에 새 노드 삽입
    head = new Node(newItem, head);
    size++;
}

public void insertAfter (E newItem, Node p) { // 노드 p 바로 다음에 새 노드 삽입
    p.setNext(new Node(newItem, p.getNext()));
    size++;
}

public void deleteFormt() {
        if (isEmpty()) {throw NoSuchElementException();}
        head = head.getNext();
        size--;
}

public void deleteAfter(Node p) {
        if (p==null) {throw NoSuchElementException();}
        Node t = p,getNext();
        p.setNext(t.getNext());
        t.setNext(null);
        size--;

}
}

