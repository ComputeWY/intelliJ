package Java0507;
import java.util.Scanner;

public class Java0507_2 {

    static int cardConR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        do {
            d[digits++] = dchar.charAt(x%r);
            x /= r;
        }
        while (x != 0);
            return digits;

    }
}
