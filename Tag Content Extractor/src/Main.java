import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i=0; i < quantity; i++) {

            String input = sc.nextLine();

            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(input);

            boolean matchFound = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }

            if (!matchFound) {
                System.out.println("None");
            }
        }
        sc.close();
    }
}