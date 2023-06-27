import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek weekDay = date.getDayOfWeek();

        String nameDayWeek = weekDay.getDisplayName(TextStyle.FULL, Locale.getDefault());

        System.out.println(nameDayWeek.toUpperCase());

        sc.close();
    }
}