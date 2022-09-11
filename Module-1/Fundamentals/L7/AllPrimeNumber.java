package L7;

import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isPrime = false;
        int count = 0;
        for (int i = 2; i <= n - 1; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
