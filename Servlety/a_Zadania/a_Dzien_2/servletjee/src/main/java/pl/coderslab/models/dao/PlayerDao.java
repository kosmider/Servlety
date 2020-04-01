package pl.coderslab.models.dao;

import pl.coderslab.models.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerDao {
    public static List<Player> getList() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Robert", "Lewandowski", 31));
        players.add(new Player("Jacek", "Krzynowek", 45));
        players.add(new Player("Kamil", "Grosicki", 30));
        return players;
    }
}
