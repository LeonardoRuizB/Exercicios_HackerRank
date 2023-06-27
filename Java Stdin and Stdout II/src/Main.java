import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        double number2 = sc.nextDouble();
        sc.nextLine();
        String text = sc.nextLine();

        System.out.println("String: " + text);
        System.out.println("Double: " + number2);
        System.out.println("Int: " + number);

        sc.close();
    }
}