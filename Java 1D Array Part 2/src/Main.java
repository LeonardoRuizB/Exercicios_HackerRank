import java.util.Scanner;

public class Main {

    public static boolean canWIn(int leap, int[] game) {
        return isSolvable(0, leap, game);
    }

    private static boolean isSolvable(int position, int leap, int[] game) {
        if (position >= game.length) {
            return true;
        }

        if (position < 0 || game[position] == 1) {
            return false;
        }

        game[position] = 1;

        return isSolvable(position + leap, leap, game) ||
                isSolvable(position + 1, leap, game) ||
                isSolvable(position - 1, leap, game);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while(q-- > 0) {
            int n = sc.nextInt();
            int leap = sc.nextInt();

            int[] game = new int[n];
            for(int i=0; i < n; i++) {
                game[i] = sc.nextInt();
            }

            System.out.println(canWIn(leap, game) ? "YES" : "NO");
        }
        sc.close();
    }
}