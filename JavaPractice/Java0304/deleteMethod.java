package Java0304;

public class deleteMethod {
    public void delete(Key k) {
        root = delete(root, k);
    }

    public Node delete(Node n, Key k) {
        if (n == null) {
            return null;
        }
        int t = n.getKey().compareTo(k);

        if (t > 0) {
            n.setLeft(delete(n.getLeft(), k));
        } else if (t < 0) {
            n.setRight(delete(n.getRight(), k));
        } else {
            if (n.getRight() == null) {
                return n.getLeft();
            }
            if (n.getLeft() == null) {
                return n.getRight();
            }

            Node target = n;
            n = min(target.getRight());
            n.setRight(deleteMin(target.getRight()));
            n.setLeft(target.getLeft());
        }

        return n;
    }
}
