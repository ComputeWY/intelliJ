package Java0226;
import java.util.*;

public class BinaryTree<Key extends Comparable<Key>> {
    private Node root;
    public BinaryTree() {root = null;} //트리 생성자
    public Node getRoot() {return root;}
    public void setRoot(Node newRoot) {root = newRoot;}
    public boolean isEmpty() {return root == null;}

    public void preorder(Node n) {//전위 순회
    if (n != null) {
        System.out.print(n.getKey()+""); //노드 n 방문
        preorder(n.getLeft());
        preorder(n.getRight());
    }
    }

    public void inorder(Node n) {//전위 순회
        if (n != null) {
            inorder(n.getLeft());
            System.out.print(n.getKey()+""); //노드 n 방문
            inorder(n.getRight());
        }
    }
    public void postorder(Node n) {//후위 순회
        if (n != null) {
            postorder(n.getLeft());
            postorder(n.getRight());
            System.out.print(n.getKey()+""); //노드 n 방문

        }
    }

    public void levelorder (Node root) { //레벨 순회
        Queue<Node> q = new LinkedList<Node>(); //큐 자료구조 이용
        Node t;

        q.add(root); //루트노드 큐 삽입
        while (!q.isEmpty()) {
            t = q.remove();
            System.out.print(t.getKey()+""); //제거된 노드 출력 -> 방문
            if (t.getLeft() != null) {
                q.add(t.getLeft());
            }

            if (t.getRight() != null){
                q.add(t.getRight());
            }
        }
    }

    public int size(Node n) {
        if (n == null) {
            return 0;
        }

        else {return (1 + size(n.getLeft()) + size(n.getRight()));
    }}

    public int height(Node n) {
        if (n == null) {
            return 0;
        }

        else {
            return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
        }
    }

    public static boolean isEqual(Node n, Node m) {
        if ( n==null || m==null) {
            return n==m;
        }

        if(n.getKey().compareTo(m.getKey()) != 0) //둘다 null이 아니면 item 비교
        {return false;}

        return (isEqual(n.getLeft(), m.getLeft()) &&
                isEqual(n.getRight(), m.getRight()));


}
