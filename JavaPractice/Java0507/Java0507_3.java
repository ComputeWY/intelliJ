package Java0507;
import java.util.Scanner;

public class Java0507_3 {

    static char[] binaryscale(int num) {

        char[] d = new char[32];
        int digits = 0;
        int x = num;

        do {
          d[digits++] = (char) (x%2 + '0');
          x /= 2;
      } while(x != 0);

        return d;
    };
       public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        System.out.print("입력할 숫자");
        int num = stdIn.nextInt();

        char[] binary = binaryscale(num);

        System.out.print("이진수 표현: ");{
            for (int i = binary.length -1; i>=0; i--){
                System.out.print(binary[i]);
            }
        }



    }
}
