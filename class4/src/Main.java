import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors);

        Collections.sort(colors);
        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println(colors);

        Collections.shuffle(colors);
        System.out.println(colors);
        System.out.println("--------------------");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("--------------------");

        for(String s : colors)
        {
            System.out.println(s);
        }
        System.out.println("--------------------");

        colors.forEach(System.out::println);
        System.out.println("--------------------");

        colors.forEach(s -> {
            System.out.println(s);
        });

        Player player1 = new Player("Steve", 55);
        Player player2 = new Player("Sofie", 27);
        Player player3 = new Player("Greg", 12);

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        System.out.println(players);
    }
}

