import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double payment = sc.nextDouble();

        sc.close();

        NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatUS.format(payment);
        System.out.println("US: " + us);

        NumberFormat formatIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = formatIndia.format(payment);
        System.out.println("India: " + india);

        NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatChina.format(payment);
        System.out.println("China: " + china);

        NumberFormat formatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatFrance.format(payment);
        System.out.println("France: " + france);
    }
}