package L5;

import java.util.Scanner;

public class InterestingAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <=n; j++) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
