import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String textA = sc.nextLine();
        String textB = sc.nextLine();

        int length = textA.length() + textB.length();

        int lexicographically = textA.compareTo(textB);

        System.out.println(length);

        if (lexicographically > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String firstLetterA = textA.substring(0, 1).toUpperCase() + textA.substring(1).toLowerCase();

        String firstLetterB = textB.substring(0, 1).toUpperCase() + textB.substring(1).toLowerCase();

        System.out.println(firstLetterA + " " + firstLetterB);

        sc.close();
    }
}