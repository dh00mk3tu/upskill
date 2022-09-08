package L5;

import java.util.Scanner;

public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,x;
        n = scan.nextInt();
        x = n;
        for(int i = 1; i<=n; i++) {
            for(int j = 0; j<=i-1; j++) {
                System.out.print(i-j);
                
            }
            System.out.println();
        }

    }
    
}
