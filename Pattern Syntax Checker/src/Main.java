import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i=0; i < quantity; i++) {

            String regex = sc.nextLine();

            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}