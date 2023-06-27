import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        MyBook book = new MyBook();

        book.setTitle(input);

        System.out.println("The title is: " + book.getTitle());

        sc.close();
    }
}

abstract class Book{
    String title;

    abstract void setTitle(String s);

    String getTitle(){
        return title;
    }
}

class MyBook extends Book {
    void setTitle(String s) {
        title = s;
    }
}