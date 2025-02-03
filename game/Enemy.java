package game;
public class Enemy {
    
    private int damage;
    private int health;
    private String name;
    private int gold;

    public Enemy (String name, int damage, int health, int gold, Game puzzle) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.gold = gold;
    }

    //getter

    public String getname() {
        return name;
    }

    public int gethealth() {
        return health;
    }

    public int getgold() {
        return gold;
    }

    public int getdamage() {
        return damage;
    }

    //setter

    public void setname(String name) {
        this.name = name;
    }

    public void sethealth(int health) {
        this.health = health;
    }

    public void setdamage(int damage) {
        this.damage = damage;
    }

    public void setname(int gold) {
        this.gold = gold;
    }

    //methoden

    public void attack(Spieler spieler) {  
        spieler.sethealth(spieler.gethealth() - this.damage);
    }

    public void takeDamage(Spieler spieler) {
        this.health -= spieler.getdamage();
    }

    public void dropGold(Spieler spieler) {
        spieler.setgold(spieler.getgold() + this.gold);
    }

    public void print() {
        System.out.println("Name: " + getname());
        System.out.println("Leben: " + gethealth());
        System.out.println("Gold: " + getgold());
        System.out.println("Schaden: " + getdamage());
    }

    
}
