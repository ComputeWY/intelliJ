package Java0226;
import Java0226.Node2;
public class UnionFind {
    protected Node[] a;
    public UnionFind(Node[] iarray) { // 생성자
        a = iarray;
    }
    //i가 속한 집합의 루트를 재귀적으로 찾고 경로상의 각 원소의 부모를 루트로 만든다.

    protected int find(int i) { // 경로 압축
        if (i != a[i].getParent()) {
            a[i].setParent(find(a[i].getParent()));
        }

        return a[i].getParent();
    }

    public void union(int i, int j){
        int iroot = find(i);
        int jroot = find(j);

        if (iroot == jroot) {
            return;
        }

        if (a[iroot].getRank() > a[jroot].getRank()) {
            a[jroot].setParent(iroot);
        } else if (a[iroot].getRank() < a[jroot].getRank()) {
            a[iroot].setParent(jroot);
        } else {
            a[iroot].setParent(jroot);
            int t = a[jroot].getRank() + 1;
            a[jroot].setRank(t);
        }


}
