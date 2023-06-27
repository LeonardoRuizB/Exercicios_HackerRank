import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= -100 && number <= 100) {
            String text = Integer.toString(number);
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        sc.close();
    }
}