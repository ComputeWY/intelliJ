package Java0222;
import java.util.NoSuchElementException;
public class CList  <E> {
    private Node last; //리스트의 마지막 노드(항목)을 가르킨다.
    private int size;
    public CList() {
        last = null;
        size = 0;
    }
//삽입, 삭제 연산을 위한 메소드 선언


public void insert(E newItem) { //last가 가르키는 노드의 다음에 새노드 삽입

        Node newNode = new Node(newItem, null); //새노드 생성
    if (last == null) { //리스트가 empty일때
        newNode.setNext(newNode);
        last = newNode;
    }
    else {
        newNode.setNext(last.getNext()); //newNode의 다음노드가 last가 가리키는 노드의 다음노드가 되도록

        last.setNext(newNode);
    }

    size++;
}
public Node delete() {
        if (isEmpty()) {throw new NoSuchElementException();
        Node x = last.getNext();
        if (x == last) {last = null;}
        else {
            last.setNext(x.getNext());
            x.setNext(null);
        }

        size--;
        return x;

}
}

