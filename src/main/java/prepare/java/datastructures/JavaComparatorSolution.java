package prepare.java.datastructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparatorSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}

class Checker implements Comparator {

    @Override
    public int compare(final Object o1, final Object o2) {
        assert (o1 instanceof Player);
        assert (o2 instanceof Player);

        Player player1 = (Player) o1;
        Player player2 = (Player) o2;

        if (player1.score == player2.score) {
            return player1.name.compareTo(player2.name);
        }
        return player1.score > player2.score ? -1 : 1;
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}