import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int m1, m2, m3;

        // Input
        char name = str.charAt(0);
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();

        // avg
        // avg = (m1 + m2 + m3)/3;
        
        // output 
        System.out.println(name);
        System.out.println((m1 + m2 + m3)/3);
    }
}
