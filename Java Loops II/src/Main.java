import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        for (int i=0; i < quantity; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int result = a;
            for (int j=0; j < n; j++) {
                result += Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}