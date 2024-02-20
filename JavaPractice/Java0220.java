
import org.w3c.dom.Node;

import java.security.Key;

public class Java0220 <Key extends Comparable<Key>> {
    private Key item;
    private Java0220<Key> left;
    private Java0220<Key> right;
    public Java0220(Key newItem, Java0220 lt, Java0220 rt ) {
        item = newItem; left = lt; right = rt; }
    public Key getKey() { return item;}
    public Java0220<Key> getLeft() { return left; }
    public Java0220<Key> getRight() { return right; }

    public void setKey(Key newItem) {item = newItem;}
    public void setLeft(Java0220<Key> lt) { left = lt;}
    public void setRight(Java0220<Key> rt) {right = rt;}
}
