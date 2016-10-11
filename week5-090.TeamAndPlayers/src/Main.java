
public class Main {

    public static void main(String[] args) {
        Team j = new Team("RAGE");
        Player p = new Player("Jaakko");
        j.addPlayer(p);
        j.printPlayers();
    }
}
