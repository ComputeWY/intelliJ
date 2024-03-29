import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class java0125 {
    static int n;
    static int[][] grid;

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("data.txt"));
            n = inFile.nextInt();
            grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = inFile.nextInt();
                }
            }
            inFile.close();

            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    for (int dir = 0; dir < 8; dir++) {
                        for (int len = 1; len < n; len++) {
                            int val = computeValue(x, y, dir, len);
                            if (val != -1 && isPrime(val)) {
                                System.out.println(val);
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static int[] offsetX = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] offsetY = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static int getDigit(int x, int y, int dir, int k) {
        int newX = x + k * offsetX[dir];
        int newY = y + k * offsetY[dir];

        if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid.length) {
            return -1;
        } else {
            return grid[newX][newY];
        }
    }

    public static int computeValue(int X, int Y, int dir, int len) {
        // Placeholder: Replace with your logic
        return getDigit(X, Y, dir, len);
    }

    public static boolean isPrime(int k) {
        if (k < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}//
