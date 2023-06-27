import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String textA = sc.nextLine();
        String textB = sc.nextLine();

        sc.close();

        if (isAnagram(textA, textB)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    static boolean isAnagram(String a, String b) {
        // Verifica se as strings têm o mesmo comprimento
        if (a.length() != b.length()) {
            return false;
        }

        // Converte para letras maiúsculas
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Converte as strings em arrays de caracteres
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        // Ordena os arrays
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        // Verifica se os arrays ordenados são iguais
        return Arrays.equals(arrayA, arrayB);
    }
}