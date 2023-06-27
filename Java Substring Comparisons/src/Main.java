import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int number = sc.nextInt();

        sc.close();

        String largest = "";

        String smallest = "";

        for (int i=0; i <= text.length() - number; i++) {
            String substring = text.substring(i, i + number);

            if (smallest.equals("") || substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            if (largest.equals("") || substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        System.out.println(smallest + "\n" + largest);

    }
}