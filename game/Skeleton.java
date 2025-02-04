package game;

public class Skeleton extends Enemy {
    
    public Skeleton () {
        super ("Larry", 5, 20, 0, null);
    }

    public void gebeInformationen() {
        System.out.println("Hier ist Information.");
    }
    
    @Override
public void attack(Spieler spieler) {
    spieler.sethealth(spieler.gethealth() - getdamage());
}

public void takeDamage(Spieler spieler) {
    sethealth(gethealth() - spieler.getdamage());
}

public void dropGold(Spieler spieler) {
    spieler.setgold(spieler.getgold() + this.getgold());
}

public void print() {
        System.out.println("Name: " + getname());
        System.out.println("Leben: " + gethealth());
        System.out.println("Gold: " + getgold());
        System.out.println("Schaden: " + getdamage());
}



}
