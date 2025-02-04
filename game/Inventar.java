package game;
import game.Spieler;

import java.util.ArrayList;

public class Inventar {
    public static void main(String[] args) {

        Spieler spieler = new Spieler(null, 0, 0, null);
        
        ArrayList<String> inventar = new ArrayList<String>();

        inventar.add(spieler.getweapon());
        

    }
    
}
