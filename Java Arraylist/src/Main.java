import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> mainlinst = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int size = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for(int j=0; j<size; j++) {
                int item = sc.nextInt();
                list.add(item);
            }
            mainlinst.add(list);
        }

        int totalPrint = sc.nextInt();
        for (int k=0; k<totalPrint; k++) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            try {
                System.out.println(mainlinst.get(row-1).get(col-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}