import java.util.Date;
import java.util.Scanner;
import java.util.Random;
public class Date_Random_Scanner {
    public static void main(String[] args) {
        Date d = new Date();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int sal = sc.nextInt();
        String eName = sc.next();

        System.out.println(eName + r.nextInt(10000) + sal + d);
    }
}
