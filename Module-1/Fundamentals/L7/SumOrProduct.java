package L7;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int c = scan.nextInt();
        int sum = 0, prod = 1;
        switch (c) {
            case 1:
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.print(sum);
                break;

            case 2:
                for (int i = 1; i <= n; i++) {
                    prod *= i;
                }
                System.out.print(prod);
                break;

            default:
                System.out.print("-1");
        }
    }
}
