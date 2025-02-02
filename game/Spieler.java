package game;
public class Spieler {
    
    private String  name = "Unbekannt";
    private int     health = 50;
    private int     gold = 0;
    private String  weapon = "Faust";
    private int     damage = 10;

   public Spieler(String name, int health, int gold, String weapon) {
    
    this.name = name;
    this.health = health;
    this.gold = gold;
    this.weapon = weapon;
    this.damage = damage;
    
   }
   //getter
   public int getdamage() {
    return damage;
   }

   public int gethealth() {
    return health;
   }

   public int getgold() {
    return gold;
   }

   public String getname() {
    return name;
   }

   public String getweapon() {
    return weapon;
   }
   
   //setter
   public void sethealth(int health) {
    this.health = health;
   }

   public void setgold(int gold) {
    this.gold = gold;
   }

   public void setname(String name) {
    this.name = name;
   }

   public void setweapon(String weapon) {
    this.weapon = weapon;
   }

   public void setdamage(int damage) {
    this.damage = damage;
   }

   //methoden
    
   public void takeDamage(Enemy enemy) {
        this.health -= enemy.getdamage();
    }

    public void attack(Enemy enemy) {  
        enemy.sethealth(enemy.gethealth() - this.damage);
    }
    
    public void addGold(Enemy enemy) {
        this.gold += enemy.getgold();
    }

    public void print() {
        System.out.println("Name: " + getname());
        System.out.println("Leben: " + gethealth());
        System.out.println("Gold: " + getgold());
        System.out.println("Waffe: " + getweapon());
        System.out.println("Schaden: " + getdamage());
    }


}
