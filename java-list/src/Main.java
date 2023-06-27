import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i=0; i < n; i++) {
            int l = sc.nextInt();
            list.add(l);
        }

        int q = sc.nextInt();
        int num = 0;
        while(num < q) {
            String option = sc.next().toUpperCase();

            if(option.equals("INSERT")) {
                int positionInsert = sc.nextInt();
                int number = sc.nextInt();
                list.add(positionInsert, number);
            } else if(option.equals("DELETE")) {
                int positionDelete = sc.nextInt();
                list.remove(positionDelete);
            }
            num++;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}