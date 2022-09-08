package L2;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i=2;
        n = scan.nextInt();
        while(i<n) {
            if(n%i == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
            i++;
        }
    }
}
