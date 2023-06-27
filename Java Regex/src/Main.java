/*import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        while (true) {
            String input = sc.nextLine();

            if (main.isIp(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    private static boolean isIp(String input) {
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(ipPattern);

        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}*/

import java.util.Scanner;

class MyRegex {
    String pattern;

    public MyRegex() {
        String segment = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        pattern = String.format("%s\\.%s\\.%s\\.%s", segment, segment, segment, segment);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String ip = sc.nextLine();

            System.out.println(ip.matches(new MyRegex().pattern));
        }
    }
}