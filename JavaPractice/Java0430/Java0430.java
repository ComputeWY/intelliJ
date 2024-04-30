
package Java0430;
import java.util.Scanner;
public class Java0430 {

    static class Max3m {
        static int max3 (int a, int b, int c) {
            int max = a;

            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }
            return max;
        }

    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수 입력:");
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        int max = Max3m.max3(a, b, c);
        System.out.println("최댓값은 " + max + "입니다.");
    }
}
