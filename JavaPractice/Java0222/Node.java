
package Java0222;

public class Node <E> {
    private E item;
    private Node<E> next;

//Node<E> 클래스에서 item과 next는 모두 제네릭 타입인 E를 사용하고 있습니다.
// 그러나 각각의 역할과 용도가 다릅니다.
//
//private E item;: 이 변수는 노드에 저장되는 요소를 나타냅니다.
// 즉, 노드가 담고 있는 데이터를 나타내는 부분입니다. 예를 들어, 정수를 저장하는 Node 클래스라면 item은 정수형 데이터를 저장하는 데 사용될 것입니다.
// 이렇게 item은 노드에 저장되는 실제 데이터의 타입을 나타내며, 각 노드마다 서로 다른 데이터 타입을 가질 수 있습니다.
//
//private Node<E> next;: 이 변수는 다음 노드를 가리키는 참조를 저장합니다.
// 즉, 연결 리스트에서 한 노드가 다음 노드를 가리키는 포인터 역할을 합니다.
// 이 때, 제네릭 타입 E를 사용함으로써 다음 노드의 타입이 현재 노드와 동일하다는 것을 보장합니다.
// 예를 들어, 정수를 저장하는 Node 클래스에서 next는 또 다른 정수를 저장하는 노드를 가리킬 것입니다.
//
//따라서 item은 노드가 담고 있는 데이터의 타입을 지정하는 데 사용되고,
// next는 다음 노드를 가리키는 참조의 타입을 지정하는 데 사용됩니다. 이 둘은 서로 다른 역할을 하지만,
// 모두 제네릭을 사용하여 다양한 타입의 데이터를 저장하고 다룰 수 있도록 합니다.

public Node(E newItem, Node<E> node){ // 생성자

    item = newItem;
    next = node;

}// get과 set 메서드

    public E getItem() {return item;}

    public Node <E> getNext() {return next;}

    public void setItem(E newItem) {item = newItem;}

    public void setNext(Node<E> newNext) {next = newNext;}

}
