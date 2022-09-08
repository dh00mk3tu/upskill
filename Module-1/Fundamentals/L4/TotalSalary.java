package L4;
import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float basic;
        float hra,da,allow = 0,pf;
        int t;
        basic = scan.nextInt();
        String str = scan.next();
        int ch = str.charAt(0);
        hra = (20*basic)/100;
        da = (50*basic)/100;
        pf = (11*basic)/100;
        if (ch >= 65 && ch <= 90) {
            // stuff
            switch(ch) {
                case 65 : allow = 1700;
                          break;
                case 66 : allow = 1500;
                          break;
                default : allow = 1300;
                          break;
            }
        }
        t = Math.round((basic+hra+da+allow)-pf);
        // t = int(t);
        System.out.println(t);
    }
}
