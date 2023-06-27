import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i=0; i < quantity; i++) {
            String username = sc.nextLine();

            if (username.length() < 8 || username.length() > 30) {
                System.out.println("Invalid");
            } else {
                if (!isValidUsername(username)) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("Valid");
                }
            }
        }
        sc.close();
    }

    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]*$";

        return Pattern.matches(regex, username);
    }
}