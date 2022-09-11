package L7;

import java.util.Scanner;

public class NthFibbonacciNumber {

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fib(n));
    }
}
