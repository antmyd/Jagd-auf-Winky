package game;

public class Riese extends Enemy {
    
    public Riese() {
        super ("Riese", 10, 200, 4);
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

}