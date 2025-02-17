package game;

public class Waffe {
    public int schadenWaffe;
    public String name;
    
    

    public Waffe(int schadenWaffe, String name) {
        this.schadenWaffe = schadenWaffe;
        this.name = name;
    }

    public void ausrüsten(Spieler spieler) {
        
        Inventar.addItem(name);
        spieler.setdamage(schadenWaffe);
        spieler.setweapon(name);
    }
}
