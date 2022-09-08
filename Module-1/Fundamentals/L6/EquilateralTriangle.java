package L6;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0, count1 = 0, k = 0;

        for (int i = 1; i <= n; ++i) {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print(" ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= n - 1) {
                    System.out.print(i + k + " ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print(i + k - 2 * count1 + " ");
                }
                ++k;
            }
            count1 = count = k = 0;
            System.out.println();
        }
    }
}
