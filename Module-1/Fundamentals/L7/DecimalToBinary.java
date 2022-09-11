package L7;

import java.util.Scanner;

import javax.naming.NamingException;

public class DecimalToBinary {
    public static void toBinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        if (decimal == 0) {
            System.out.print("0");
        } else {
            while (decimal > 0) {
                binary[index++] = decimal % 2;
                decimal = decimal / 2;
            }
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(binary[i]);
            }
            System.out.println();// new line
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        toBinary(n);
    }
}
