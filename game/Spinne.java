package game;
public class Spinne extends Enemy {

    public Spinne() {
        super("Spinne", 25, 100, 6, null);
    }
    
    @Override

    
    public void attack(Spieler spieler) {
        
        spieler.sethealth(spieler.gethealth() - this.getdamage());  
    }

    public void takeDamage(Spieler spieler) {
        sethealth(gethealth() - spieler.getdamage());
    }

    public void dropGold(Spieler spieler) {
        spieler.setgold(spieler.getgold() + this.getgold());
    }

    public void print() {
        System.out.println("========== Eigenschaften Gegner ==========");
        System.out.println("Name: " + getname());
        System.out.println("Leben: " + gethealth());
        System.out.println("Gold: " + getgold());
        System.out.println("Schaden: " + getdamage());
    }
    
}

