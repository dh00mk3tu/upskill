package L5;

import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int n;
            n = scan.nextInt();
            for(int i = 1; i<=n; i++) {
                for(int j = 1; j<=i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
    }
}
