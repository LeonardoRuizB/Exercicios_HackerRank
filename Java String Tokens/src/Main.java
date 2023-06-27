import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        sc.close();

        text = text.replaceAll("[^A-Za-z\\s]+", " ");

        String[] words = text.trim().split("\\s");

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
    }
}