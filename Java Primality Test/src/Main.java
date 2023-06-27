import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);){
            System.out.println(sc.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }
}