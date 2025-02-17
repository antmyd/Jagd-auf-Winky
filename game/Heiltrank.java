package game;

public class Heiltrank {
    
public int value;
public int istFass;

    public Heiltrank(int value, boolean istFass) {
        this.value = value;
    }



    public void trinken(Spieler spieler, boolean istFass) {
        if (!istFass) {
            System.out.println("Gluck, Gluck...");
            spieler.sethealth(spieler.gethealth() + value);
        } else if (istFass) {
            System.out.println("Gluck, Gluck, Gluck, Gluck...");
            spieler.sethealth(spieler.getmaxHealth());
        }
    
    

    }
}
