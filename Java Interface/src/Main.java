import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        MyCalculator myCalculator = new MyCalculator();

        Class<?>[] interfaces = myCalculator.getClass().getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println("I implemented: " + anInterface.getSimpleName());
        }

        System.out.println(myCalculator.divisor_sum(number));

        sc.close();
    }
}

interface AdvancedArithmetic {

    default int divisor_sum(int n) {
        int count = 1;
        int result = 0;

        while (count <= n) {
            if (n % count == 0) {
                result += count;
            }
            count++;
        }
        return result;
    }
}

class MyCalculator implements AdvancedArithmetic {

}