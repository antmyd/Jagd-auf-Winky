package game;
import java.util.Random;
import java.util.Scanner;

public class Spieler {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    private String  name = "Unbekannt";
    private int     health = 50 + getschild();
    private int     gold = 0;
    private String  weapon = "Faust";
    private int     damage = 10;
    private int     schild = 0;
    

   public Spieler(String name, int health, int gold, String weapon, int damage, int schild) {
    
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

   public int getschild() {
    return schild;
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

   public void setschild(int schild) {
    this.schild = schild;
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
        System.out.println("========== Eigenschaften Held ==========");
        System.out.println("Name: " + getname());
        System.out.println("Leben: " + gethealth());
        System.out.println("Gold: " + getgold());
        System.out.println("Waffe: " + getweapon());
        System.out.println("Schaden: " + getdamage());
    }

    public void fight(Spieler spieler, Enemy enemy) {
        System.out.println("========== Kampf ==========");
        if (spieler.getweapon().equalsIgnoreCase("Frostaxt")) {
            System.out.println("Deine Frostaxt verlangsamt deine Gegner. Sie verursachen dadurch 10 Schaden weniger als sonst.");
            enemy.setdamage(enemy.getdamage() - 10);

        } else if (spieler.getweapon().equalsIgnoreCase("Feuerklinge")) {
            System.out.println("Deine Feuerklinge setzt deine Gegner in Flammen. Dadurch verlieren sie dauerhaft 5 Schaden während des Kampfes");
        }
        while (enemy.gethealth() > 0  && spieler.gethealth() > 0 ) {
        
        System.out.println("Du greifst an! Verursachter Schaden: " + spieler.getdamage());
        enemy.sethealth(enemy.gethealth() - spieler.getdamage());
        
        if (spieler.getweapon().equalsIgnoreCase("Feuerklinge")) {
            System.out.println("Schaden durch Verbrennungen :" + 5);
            enemy.sethealth(enemy.gethealth() - 5);

        }
         
         System.out.println();
         System.out.println(enemy.getname() + " Leben: " + enemy.gethealth() );
         System.out.println();
        
        System.out.println(enemy.getname() + " greift  an! Verursachter Schaden: " + enemy.getdamage());
        spieler.sethealth(spieler.gethealth() - enemy.getdamage());
        System.out.println();
        System.out.println("Dein Leben " + spieler.gethealth());
        
        if (enemy.gethealth() <= 0) {
           
            System.out.println("Du hast " + enemy.getname() + " besiegt!");

            System.out.println("=====================================");
            
        
        } else if (spieler.gethealth() <= 0) {
            System.out.println(enemy.getname() + " hat dich besiegt!");
            System.out.println("Die Mission ist gescheitert.");
            System.out.println("=====================================");
            System.exit(0);
    
    }
        
        
        
        
    
    }

}





}
