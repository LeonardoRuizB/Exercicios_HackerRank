import java.util.Scanner;

public class Main {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();


        for (int i = 1; i <= quantity; i++) {
            try {
                long number = sc.nextLong();

                if (number > Long.MAX_VALUE || number < Long.MIN_VALUE) {
                    System.out.println(number + " can't be fitted anywhere.");
                } else {
                    System.out.println(number + " can be fitted in:");

                    if (number >= -128 && number <= 127) {
                        System.out.println("* byte");
                    }

                    if (number >= -32768 && number <= 32767) {
                        System.out.println("* short");
                    }

                    if (number >= -2147483648 && number <= 2147483647) {
                        System.out.println("* int");
                    }

                    if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}