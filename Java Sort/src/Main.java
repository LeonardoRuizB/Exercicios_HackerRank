import java.util.*;

class Player {
    int id;
    String name;
    double cgpa;

    Player(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class PlayerComparator implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
        if (p1.cgpa != p2.cgpa) {
            return Double.compare(p2.cgpa, p1.cgpa);
        } else {
            return p1.name.compareTo(p2.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        List<Player> players = new ArrayList<>();

        for (int i=0; i < quantity; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            players.add(new Player(id, name, cgpa));
        }

        Collections.sort(players, new PlayerComparator());

        for (Player player : players) {
            System.out.println(player.name);
        }

        sc.close();
    }
}