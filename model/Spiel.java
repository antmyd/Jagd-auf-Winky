package model;

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

        String choice = sc.nextLine();
        
        Spieler spieler = new Spieler(name, 50, 0, "Faust");
        if (choice.equalsIgnoreCase("ja")) {
             
                spieler.print();
                System.out.println();
                System.out.println("Drücke eine beliebige Taste um fortufahren:");
                sc.nextLine();
                abenteuer(spieler, sc);

        } else if (choice.equalsIgnoreCase("nein")) {
            System.out.println("Dann kann dein Aben teuer losgehen!");
            abenteuer(spieler, sc);
        
        } else { 
            System.out.println("Unglütige Eingabe.");
            System.exit(0);
        }
    }
    
        public static void abenteuer(Spieler spieler, Scanner sc) {
         
        System.out.println("Du betrittst den Eingang der Grube");
        System.out.println("Auf dem Boden findest du ein rostiges Schwert. Willst du es aufheben und als neue Waffe ausrüsten? Ja oder Nein?");
        System.out.println();
       
        String auswahl = sc.nextLine();

        if (auswahl.equalsIgnoreCase("ja")) {
        
            spieler.setweapon("rostiges Schwert");
            System.out.println("Du hast nun das " +  spieler.getweapon() + " als deine neue Waffe ausgerüstet.");
            spieler.setdamage(15); 
            System.out.println("Du verursachst nun " + spieler.getdamage() + " Schaden");
        
        } else if (auswahl.equalsIgnoreCase("nein")) {
            System.out.println("Du fährst mit deinen Fäusten als einzige Waffe fort...ob das eine gute Entscheidung war?");
        } else { 
            System.out.println("Unglütige Eingabe.");
            System.exit(0);
        }
    }
}