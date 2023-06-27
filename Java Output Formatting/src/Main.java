import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        int number1 = sc.nextInt();

        String name2 = sc.next();
        int number2 = sc.nextInt();

        String name3 = sc.next();
        int number3 = sc.nextInt();

        System.out.println("================================");
        System.out.printf("%-15s %03d%n", name1, number1);
        System.out.printf("%-15s %03d%n", name2, number2);
        System.out.printf("%-15s %03d%n", name3, number3);
        System.out.println("================================");

        sc.close();
    }
}