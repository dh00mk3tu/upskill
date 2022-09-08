package L2;
import java.util.Scanner;

public class Farenheitmap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s,e,w;
        double f;
        s = scan.nextInt();
        e = scan.nextInt();
        w = scan.nextInt();
        // F = (C*1.8)+32
        while( s<=e) {
            f = (s-32)/1.8;
            // f = (int)f;
            System.out.print(s + " ");
            System.out.print((int)f);
            System.out.println("\n");
            s = s + w;
        }


    }
}
