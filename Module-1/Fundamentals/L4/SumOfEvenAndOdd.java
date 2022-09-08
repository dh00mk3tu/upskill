package L4;
import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,es=0,os=0,dig;
        n = scan.nextInt();
        while(n>0) {
            dig = n%10;
            if(dig%2 == 0) {
                es += dig;
            }
            else {
                os += dig;
            }
            n = n/10;
        }
        System.out.println(es + " " + os);
    }
}
