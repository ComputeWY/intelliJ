package Java0227;

public class BST_remove {
    private Node root;

    public void remove(int key) {
        root = removeNode(root, key);
    }

    private Node removeNode(Node node, int key) {
        if (node == null) {
            throw new RuntimeException("해당 값을 가진 노드를 찾을 수 없습니다.");
        }

        if (node.key > key) {
            node.left = removeNode(node.left, key);
        } else if (node.key < key) {
            node.right = removeNode(node.right, key);
        } else {
            if (node.left != null) {
                Node child = findMaxNode(node.left);
                int removeKey = node.key;
                node.key = child.key;
                child.key = removeKey;
                node.left = removeNode(node.left, key);
            } else if (node.right != null) {
                Node child = findMinNode(node.right);
                int removedKey = node.key;
                node.key = child.key;
                child.key = removedKey;
                node.right = removeNode(node.right, key);
            } else {
                return null;
            }
        }
        return node;
    }

    private Node findMaxNode(Node node) {
        if (node.right == null) {
            return node;
        } else {
            return findMaxNode(node.right);
        }
    }

    private Node findMinNode(Node node) {
        if (node.left == null) {
            return node;
        } else {
            return findMinNode(node.left);
        }
    }
}
