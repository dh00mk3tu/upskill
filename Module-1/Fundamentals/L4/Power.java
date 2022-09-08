package L4;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,n,i=1,p=1;
        x = scan.nextInt();
        n = scan.nextInt();
        while(i<=n) {
            p = p * x;
            i++;
        }
        System.out.println(p);
    }
}
