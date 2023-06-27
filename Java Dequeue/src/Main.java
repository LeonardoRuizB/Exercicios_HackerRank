import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();

        HashMap<Integer, Integer> hm = new HashMap<>();

        int max = 0;

        for (int i=0; i < n; i++) {
            int number = sc.nextInt();
            if (i > m) {
                int first = dq.removeFirst();
                hm.put(first, hm.get(first) - 1);
                if (hm.get(first) == 0) {
                    hm.remove(first);
                }
            }
            dq.addLast(number);
            hm.put(number, hm.get(number) == null ? 1 : hm.get(number) + 1);
            max = Math.max(max, hm.size());
            if (max == m) {
                break;
            }
        }
        System.out.println(max);

        sc.close();
    }
}