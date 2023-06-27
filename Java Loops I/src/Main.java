import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            multiplier++;
        }

        sc.close();
    }
}