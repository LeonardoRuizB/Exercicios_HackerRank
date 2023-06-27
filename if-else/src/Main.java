import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 != 0) {
            System.out.println("Weird");
        } else if (number % 2 == 0 && number >= 2 && number <= 5) {
            System.out.println("Not Weird");
        } else if (number % 2 == 0 && number >= 6 && number <= 20) {
            System.out.println("Weird");
        } else if (number % 2 == 0 && number > 20) {
            System.out.println("Not Weird");
        }

        sc.close();
    }
}