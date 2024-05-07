package Java0507;

import java.util.Scanner;

class Java0507 {
    static boolean eqauls(int[] a, int[] b){
        if (a.length != b.length) {
            return false;
        }

        for (int i=0; i <a.length; i++){
            if (a[i] != b[i]) {
                return false;
            }}

        return true;
        }


        public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
            System.out.print("배열 a의 요솟수");
            int na = stdIn.nextInt();

            int[] a = new int[na]; // 요솟수가 na인 배열

            for (int i=0; i<na; i++){
                System.out.print("a[" + i + "] :");
                a[i] = stdIn.nextInt();
            }

            System.out.print("배열 b의 요솟수");
            int nb = stdIn.nextInt();
            int[] b =new int[nb];

             for (int i=0; i<na; i++){
                System.out.print("b[" + i + "] :");
                b[i] = stdIn.nextInt();
            }

             System.out.print("배열 a와 b는" + (eqauls(a,b) ? "같습니다." : "같지않습니다."));

        }

    }

