import java.util.Scanner;

public class Progaramss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String [] numbersAsString = a.split("");

        for (int i = 0; i < a.length(); i++){
            System.out.println(numbersAsString[i]);
        }

    }
}