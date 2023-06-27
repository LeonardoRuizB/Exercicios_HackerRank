import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int quantity = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> list = new TreeMap<>();

        for(int i=0; i < quantity; i++) {
            String name = sc.nextLine();
            int tel = sc.nextInt();
            sc.nextLine();
            list.put(name, tel);
        }

        for (int j = 0; j < quantity; j++) {
            String searchName = sc.nextLine();

            if (list.containsKey(searchName)) {
                System.out.println(searchName + "=" + list.get(searchName));
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}