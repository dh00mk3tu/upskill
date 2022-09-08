package L6;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = n;
        System.out.println("*");
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                // x--;
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            System.out.print("*");
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();
        }

        System.out.print("*");
    }
}
