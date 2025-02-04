package model;

import game.Enemy;
import game.Inventar;
import game.Skeleton;
import game.Spieler;
import java.util.Scanner;



public class Spiel {
   
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen zum Spiel!");
        System.out.println();
        System.out.println("Wie lautet dein Name, tapferer Held?");
        System.out.println();
        
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("Sei gegrüßt " + name + "!. Du befindest dich gerade mitten in einem dunklen Wald, vor einem Grubenloch...");
        System.out.println();
        System.out.println("Der böse Kobold Winky hat dir gerade eben noch deine ganzen 14 Goldmünzen gestohlen.");
        System.out.println("und ist damit in die Grube geflüchtet. Du hast keine Wahl außer ihm zu folgen, wenn du dein Gold zurückhaben willst.");
        System.out.println();
        System.out.println("Als Spieler hast du gewisse Eigenschaften, die dir bei deiner Aufgabe, dein Gold zurückzubekommen helfen können.");
        System.out.println();
        System.out.println("Willst du diese einsehen? Ja oder nein?");

        
        
        Spieler spieler = new Spieler(name, 50, 0, "Faust");
        Inventar inventar = new Inventar();
        
        Enemy enemy = new Enemy(name, 0, 0, 0, null);
        

        String choice = sc.nextLine();
        
        if (choice.equalsIgnoreCase("ja")) {
            System.out.println();
             
                spieler.print();
                System.out.println();
                System.out.println("Drücke eine beliebige Taste um fortufahren:");
                sc.nextLine();
                abenteuer(sc, spieler, enemy, inventar);

        } else if (choice.equalsIgnoreCase("nein")) {
            System.out.println("Dann kann dein Aben teuer losgehen!");
            abenteuer(sc, spieler, enemy, inventar);
        
        } else { 
            System.out.println("Unglütige Eingabe.");
            System.exit(0);
        }
    }
    
        public static void abenteuer(Scanner sc, Spieler spieler, Enemy enemy, Inventar inventar) {
         
        System.out.println("Du betrittst den Eingang der Grube");
        System.out.println("Auf dem Boden findest du ein rostiges Schwert. Willst du es aufheben und als neue Waffe ausrüsten? Ja oder Nein?");
        System.out.println();
       
        String auswahl = sc.nextLine();

        if (auswahl.equalsIgnoreCase("ja")) {
        
            spieler.setweapon("rostiges Schwert");
            
            System.out.println("Du hast nun das " +  spieler.getweapon() + " als deine neue Waffe ausgerüstet.");
           
            Inventar.addItem("rostiges Schwert");
            
            spieler.setdamage(15); 
            System.out.println("Du verursachst nun " +  spieler.getdamage()+ " Schaden");
            System.out.println();

            System.out.println("Wirf nun ein Blick in dein Inventar.");
            System.out.println("Dein Inventar: " + inventar.showInventory());

        
        } else if (auswahl.equalsIgnoreCase("nein")) {
            System.out.println("Du fährst mit deinen Fäusten als einzige Waffe fort...ob das eine gute Entscheidung war?");
        } else { 
            System.out.println("Unglütige Eingabe");
            abenteuer(sc, spieler, enemy, inventar);
        }

        System.out.println("Du gehst tiefer in die Grube...");
        System.out.println();
        
        Skeleton skeleton = new Skeleton();
        
        System.out.println("Klapper, Klapper...");
        System.out.println();
        System.out.println("Du triffst auf ein Larry...ein Skelett um genau zu sein. Sie sind die schwächsten Gegner, denen man im Laufe der Reise übern Weg laufen wird. ");
        System.out.println();
        System.out.println("Willst du mehr über Larrys Eigenschaften erfahren? Ja oder Nein?");
        String choice = sc.nextLine();
        
        if (choice.equalsIgnoreCase("ja")) {
             
            skeleton.print();
                System.out.println();
                System.out.println("Drücke eine beliebige Taste um fortufahren:");
                sc.nextLine();
                

        } else if (choice.equalsIgnoreCase("nein")) {
            System.out.println("Dann kann dein Abenteuer losgehen!");
            
        
        } else { 
            System.out.println("Unglütige Eingabe.");
            System.exit(0);
        }

        System.out.println("Willst du diesen Larry bekämpfen? Falls du ihn besiegst wird er dir Hinweise über Winkys Fluchtweg geben.");
        System.out.println("Ja oder Nein?");

        String auswahlLarrybekämpfen = sc.nextLine();

        if (auswahlLarrybekämpfen.equalsIgnoreCase("ja")) {
        
            spieler.fight(spieler, skeleton);
            
        
        } else if (auswahlLarrybekämpfen.equalsIgnoreCase("nein")) {
           System.out.println("Du gehst weiter.");
        } else { 
            System.out.println("Unglütige Eingabe");
            abenteuer(sc, spieler, enemy, inventar);
        }

        System.out.println("Du findest einen Heiltrank! Willst du ihn aufheben?");
        //healpotion
    }
}