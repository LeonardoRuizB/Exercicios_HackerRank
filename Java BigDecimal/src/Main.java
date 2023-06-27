import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        String[] numbers = new String[quantity];

        for (int i=0; i < quantity; i++) {
            numbers[i] = sc.next();
        }

        Arrays.sort(numbers, (a, b) -> new BigDecimal(b).compareTo(new BigDecimal(a)));

        for (int j=0; j < quantity; j++) {
            System.out.println(numbers[j]);
        }

        sc.close();
    }
}