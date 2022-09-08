package L6;

import java.util.Scanner;

public class SumStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0; 
        for (int i = 1; i <= n; i++) {
        
            for (int j = 1; j <= i; j++) {
                if(j == i) {
                    System.out.print(j);
                    // sum += j;
                }
                else {
                    System.out.print(j);
                    System.out.print("+");
                    // sum += j;
                }
                sum += j;
            }
            System.out.print("="+sum);
            sum = 0;
            System.out.println();
        }
    }
}
