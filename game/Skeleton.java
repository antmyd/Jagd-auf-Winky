package game;

public class Skeleton extends Enemy {
    
    public Skeleton () {
        super ("Larry", 5, 20, 0, null);
    }

    public void gebeInformationen1() {
        System.out.println("Wwwinky ist mit all deinem Gold geflohen. Er er nahm dddiese Leiter nach oben, weil der Pfad viel zu gefährlich ist! Es lauert dort nur so von gefährligen Spinnen");
        System.out.println("Für ein Kampf mit Spinnen bist du leider nich zu schwach.");
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
