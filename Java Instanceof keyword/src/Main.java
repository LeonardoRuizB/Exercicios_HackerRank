/* import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> countMap = new HashMap<>();

        for (int i=0; i < quantity; i++) {
            String word = sc.nextLine();

            if (word.equals("exit")) {
                break;
            }

            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            int frequency = entry.getValue();
            System.out.println(frequency);
        }
        sc.close();
    }
}*/

import java.util.*;

class Student{}
class Rockstar{}
class Hacker{}

public class Main {

    public class InstanceOFTutorial {
        static String count(ArrayList mylist) {
            int a = 0, b = 0, c = 0;
            for (int i = 0; i < mylist.size(); i++) {
                Object element = mylist.get(i);
                if (element instanceof Student)
                    a++;
                if (element instanceof Rockstar)
                    b++;
                if (element instanceof Hacker)
                    c++;
            }
            String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
            return ret;
        }

        public static void main(String[] args) {
            ArrayList mylist = new ArrayList();
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String s = sc.next();
                if (s.equals("Student")) mylist.add(new Student());
                if (s.equals("Rockstar")) mylist.add(new Rockstar());
                if (s.equals("Hacker")) mylist.add(new Hacker());
            }
            System.out.println(count(mylist));
        }
    }
}