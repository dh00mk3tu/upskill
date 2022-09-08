package L4;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i =1; 
        n = scan.nextInt();

        while(i<=10) {
            System.out.println(n*i);
            i++;
        }        
    }
}
