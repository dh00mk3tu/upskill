package L7;

import java.util.Scanner;

public class ReverseOfANumber {

    static int reverse(int n) {
        int dig = 0, r = 0;
        while (n != 0) {
            dig = n % 10;
            r = r * 10 + dig;
            n = n / 10;

        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(reverse(n));
    }
}
