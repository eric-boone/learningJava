
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        
    // Pekka buys gourmet lunch
        cardPekka.payGourmet();
        
    // Brian buys economical lunch
        cardBrian.payEconomical();

    // cards are printed (both on their own row, 
    // starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka.toString());
        System.out.println("Brian: " + cardBrian.toString());

    // Pekka loads 20 euros
        cardPekka.loadMoney(20.0);

    // Brian buys gourmet lunch
        cardBrian.payGourmet();

    // cards are printed (both on their own row, 
    // starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka.toString());
        System.out.println("Brian: " + cardBrian.toString());

    // Pekka buys economical lunch
        cardPekka.payEconomical();

    // Pekka buys economical lunch
        cardPekka.payEconomical();

    // Brian loads 50 euros
        cardBrian.loadMoney(50.0);

    // cards are printed (both on their own row, 
    // starting with the name of the card owner)
        System.out.println("Pekka: " + cardPekka.toString());
        System.out.println("Brian: " + cardBrian.toString());

    }
}
