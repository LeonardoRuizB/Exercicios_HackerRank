/*import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i=0; i < quantity; i++) {
            String input = sc.nextLine();

            String[] words = input.split("\\s+");

            Set<String> uniqueWords = new HashSet<>();
            StringBuilder sentenceNoRepeat = new StringBuilder();

            Set<String> seenWords = new HashSet<>();

            for (String word : words) {
                String lowercaseWord = word.toLowerCase();

                    if (!uniqueWords.contains(lowercaseWord)) {
                        uniqueWords.add(lowercaseWord);
                        sentenceNoRepeat.append(word).append(" ");
                    }
                }
            System.out.println(sentenceNoRepeat.toString().trim());
        }
    }
}*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner sc = new Scanner(System.in);

        int numSentences = Integer.parseInt(sc.nextLine());

        while (numSentences-- > 0){
            String input = sc.nextLine();

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }

            System.out.println(input);
        }
        sc.close();
    }
}
