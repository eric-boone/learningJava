/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dad
 */
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 10;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int totalGoals = 0;

        for (Player player : players) {
            totalGoals += player.goals();
        }

        return totalGoals;
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
