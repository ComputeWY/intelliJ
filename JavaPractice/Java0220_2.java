public class Java0220_2 {
    private int data;
    private Java0220_2 left;
    private Java0220_2 right;
    private boolean isThread;

    public Java0220_2(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.isThread = false;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Java0220_2 getLeft() {
        return left;
    }

    public void setLeft(Java0220_2 left) {
        this.left = left;
    }

    public Java0220_2 getRight() {
        return right;
    }

    public void setRight(Java0220_2 right) {
        this.right = right;
    }

    public boolean isThread() {
        return isThread;
    }

    public void setThread(boolean isThread) {
        this.isThread = isThread;
    }
}
