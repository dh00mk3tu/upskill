package L7;

import java.util.Scanner;

public class TermsOfAP {
    static int calcAP(int x) {
        return (3 * x) + 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0, i = 1;

        while (count < n) { 
            if (calcAP(i) % 4 != 0) {
                System.out.print(calcAP(i) + " ");
                count++;
            }
            i++;
        }
    }
}
