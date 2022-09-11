package L2;
import java.util.Scanner;

public class Farenheitmap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start,end,step;
        double f;
        start = scan.nextInt();
        end = scan.nextInt();
        step = scan.nextInt();
        // F = (C*1.8)+32
        while( start<=end) {
            f = (start-32)/1.8;
            // f = (int)f;
            System.out.print(start + " ");
            System.out.print((int)f);
            System.out.println("\n");
            start = start + step;
        }


    }
}
