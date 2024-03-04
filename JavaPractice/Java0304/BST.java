package Java0304;

import com.sun.jdi.Value;

public class BST <Key extends Comparable<Key>, Value>{
    public Node root;
    public Node getRoot() {return root;}

    public BST(Key newId, Value newName) {//BST 생성자
        root = new Node(newId, newName);
    }

    // get, put, min, deleteMin, delete 메서드를 선언

    public Value get(Key k) {return get(root, k);}

    public Value get(Node n, Key k) {
        if (n == null) {
            return null;
        } // k를 발견 못함

        int t = n.getKey().compareTo(k);
        if (t > 0) {
            return get(n.getLeft(), k);
        } else if (t < 0) {
            return get(n.getRight(), k);
        } else {
            return n.getValue();
        }
    }

    public void put(Key k, Value v) {root = put(root, k, v)}
}



