package L6;

import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces += 1;
            }
            int stars = 1;
            while (stars <= i) {
                System.out.print(stars);
                stars = stars + 1;
            }

            System.out.println();
            i = i + 1;
        }
    }
}
