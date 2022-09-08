package L6;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int i, j, n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if (n>2){
            n = n-2;
        } 
        for (i = 0; i <= n; i++) {
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print(i);
            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
