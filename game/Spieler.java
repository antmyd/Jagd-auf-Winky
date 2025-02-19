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
    private int     maxHealth = 50;
    private String  rüstung = null;
   
    

   public Spieler(String name, int health, int gold, String weapon, int damage, int schild) {
    
    this.name = name;
    this.health = health;
    this.gold = gold;
    this.weapon = weapon;
    this.damage = damage;
    this.maxHealth = maxHealth;
    this.schild = schild;

    
    
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

   public int getmaxHealth() {
    return maxHealth;
   }

   
   
   //setter
   public void sethealth(int health) {
    this.health = Math.min(health, maxHealth); // Stellt sicher, dass das Leben nicht über maxHealth steigt math.min nimmt immer den kleineren wert.
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

   public void setrüstung(String rüstung) {
    this.rüstung = rüstung;
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
            System.out.println("Deine Frostaxt verlangsamt deine Gegner. Dadurch hast du die Möglichleit zweimal in einem Zug anzugreifen.");

        } else if (spieler.getweapon().equalsIgnoreCase("Feuerklinge")) {
            System.out.println("Deine Feuerklinge setzt deine Gegner in Flammen. Dadurch verlieren sie dauerhaft 5 Schaden während des Kampfes");
        }
        
        while (enemy.gethealth() > 0  && spieler.gethealth() > 0 ) {
        
        System.out.println("Du greifst an! Verursachter Schaden: " + spieler.getdamage());
        enemy.sethealth(enemy.gethealth() - spieler.getdamage());
        
        if (spieler.getweapon().equalsIgnoreCase("Feuerklinge")) {
            System.out.println("Schaden durch Verbrennungen :" + 5);
            enemy.sethealth(enemy.gethealth() - 5);

        } else if(spieler.getweapon().equalsIgnoreCase("adminschwert")) {
            System.out.println("Boom!");
            enemy.sethealth(0);
        } else if(spieler.getweapon().equalsIgnoreCase("blutklinge")) {
            System.out.println("durch Blutklinge geheiltes Leben: 50");
            spieler.sethealth(spieler.gethealth()+50);
        }
         
         System.out.println();
         System.out.println(enemy.getname() + " Leben: " + enemy.gethealth() );
         System.out.println();
        
         if (spieler.getweapon().equalsIgnoreCase("Frostaxt")) {
            System.out.println("Die Frostaxt verlangsamt dein Gegner. Greife schnell nochmal an bevor der Eiseffekt verschwindet.");
            sc.nextLine();
            System.out.println("Du greifst an! Verursachter Schaden: " + spieler.getdamage());
            enemy.sethealth(enemy.gethealth() - spieler.getdamage());
            System.out.println();
            System.out.println(enemy.getname() + " Leben: " + enemy.gethealth() );
            System.out.println();

         }
        
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
