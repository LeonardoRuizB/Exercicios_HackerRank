import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class PlayerComparator implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
        if (p1.score != p2.score) {
            return Integer.compare(p2.score, p1.score);
        } else {
            return p1.name.compareTo(p2.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();

        List<Player> players = new ArrayList<>();

        for (int i=0; i < quantity; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players.add(new Player(name, score));
        }

        Collections.sort(players, new PlayerComparator());

        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }

        sc.close();
    }
}