import java.util.Arrays;
import java.util.Comparator;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.score < b.score) {
            return 1;
        } else if (a.score == b.score) { // check for names in ascending order
            if (a.name.compareTo(b.name) < 0) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }
}


public class ComparatorSorting_Solution {

    public static void main(String[] args) {
        int n = 5;
        Player[] player = new Player[n];
        Checker checker = new Checker();

        player[0] = new Player("amy", 100);
        player[1] = new Player("david", 100);
        player[2] = new Player("heraldo", 50);
        player[3] = new Player("smith", 20);
        player[4] = new Player("jones", 20);

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}