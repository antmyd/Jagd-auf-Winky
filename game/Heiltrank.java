package game;

public class Heiltrank {
    
public int value;

    public Heiltrank(int value) {
        this.value = value;
    }



    public void trinken(Spieler spieler) {
    
    System.out.println("Gluck, Gluck, Gluck...");
    spieler.sethealth(spieler.gethealth() + value);

    }
}
