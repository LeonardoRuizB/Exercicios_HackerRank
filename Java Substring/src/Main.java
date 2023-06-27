import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String text = sc.next();
        int first = sc.nextInt();
        int last = sc.nextInt();

        sc.close();

        String result = text.substring(first, last);

        System.out.println(result);

    }
}