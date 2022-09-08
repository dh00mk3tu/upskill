package L6;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = n;
        for (int i = 0; i <= x; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print(n); 
            }
            n = n-1;
            System.out.println();
        }
    }
}
