
package Java0222;
import java.util.NoSuchElementException;
import Java0222.DNode;

public class DList <E>{
    protected DNode head, tail;
    protected int size;
    public DList() { //생성자
        head = new DNode(null, null, null);
        tail = new DNode(null, head, null); //tail 이잔의 노드를 head로 만든다.
        head.setNext(tail);
        size = 0;
    } //삽입, 삭제를 연산을 위한 메소드 선언


public void insertBefore(DNode p, E newItem) { //p가 가리키는 노드 앞에 삽입
    DNode t = p.getPrevious();
    DNode newNode = new DNode(newItem, t, p);
    p.setPrevious(newNode);
    t.setPrevious(newNode);
    size++;
}

public void insertAfeter(DNode p, E newItem) { //p가 가리키는 노드뒤에 삽입
        DNode t = p.getNext();
        DNode newNode = new DNode(newItem, p, t);
        t.setPrevious(newNode);
        p.setNext(newNode);
        size++;

}

public void delete(DNode x) {
        if (x == null) {throw new NoSuchElementException();}
        DNode f = x.getPrevious();
        DNode r = x.getNext();
        f.setNext(r);
        r.setNext(f);
        size--;
}


};