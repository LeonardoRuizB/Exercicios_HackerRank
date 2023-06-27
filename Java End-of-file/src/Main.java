import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 1;
        while(sc.hasNextLine()) {
            String text = sc.nextLine();
            System.out.println(number + " " + text);
            number++;
        }

        sc.close();
    }
}