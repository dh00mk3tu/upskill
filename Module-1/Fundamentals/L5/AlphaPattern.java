package L5;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        char ch = 'A';
        for(int i = 1; i<=n; i++) {
            for(int j =1 ; j<=i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch = (char) (ch+1);
        }
    }
}
