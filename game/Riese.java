package game;

public class Riese extends Enemy {
    
    public Riese() {
        super ("Riese", 10, 200, 4, new Würfel());
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
    System.out.println("========== Eigenschaften Gegner ==========");
    System.out.println("Name: " + getname());
    System.out.println("Leben: " + gethealth());
    System.out.println("Gold: " + getgold());
    System.out.println("Schaden: " + getdamage());
}

}