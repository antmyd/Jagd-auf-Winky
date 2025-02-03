package model;

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

        Skeleton larry = new Skeleton();

        String choice = sc.nextLine();
        
        if (choice.equalsIgnoreCase("ja")) {
             
                spieler.print();
                System.out.println();
                System.out.println("Drücke eine beliebige Taste um fortufahren:");
                sc.nextLine();
                abenteuer(sc, spieler, larry);

        } else if (choice.equalsIgnoreCase("nein")) {
            System.out.println("Dann kann dein Aben teuer losgehen!");
            abenteuer(sc, spieler, larry);
        
        } else { 
            System.out.println("Unglütige Eingabe.");
            System.exit(0);
        }
    }
    
        public static void abenteuer(Scanner sc, Spieler spieler, Skeleton larry) {
         
        System.out.println("Du betrittst den Eingang der Grube");
        System.out.println("Auf dem Boden findest du ein rostiges Schwert. Willst du es aufheben und als neue Waffe ausrüsten? Ja oder Nein?");
        System.out.println();
       
        String auswahl = sc.nextLine();

        if (auswahl.equalsIgnoreCase("ja")) {
        
            spieler.setweapon("rostiges Schwert");
            System.out.println("Du hast nun das " +  spieler.getweapon() + " als deine neue Waffe ausgerüstet.");
            spieler.setdamage(15); 
            System.out.println("Du verursachst nun " +  spieler.getdamage()+ " Schaden");
            System.out.println();
        
        } else if (auswahl.equalsIgnoreCase("nein")) {
            System.out.println("Du fährst mit deinen Fäusten als einzige Waffe fort...ob das eine gute Entscheidung war?");
        } else { 
            System.out.println("Unglütige Eingabe");
            abenteuer(sc, spieler, larry);
        }

        System.out.println("Du gehst tiefer in die Grube...");
        System.out.println();
        
        System.out.println("Klapper, Klapper...");
        System.out.println();
        System.out.println("Du triffst auf ein Larry...ein Skelett um genau zu sein. Sie sind die schwächsten Gegner, denen man im Laufe der Reise übern Weg laufen wird. ");
        System.out.println();
        System.out.println("Willst du mehr über Larrys Eigenschaften erfahren? Ja oder Nein?");
        String choice = sc.nextLine();
        
        if (choice.equalsIgnoreCase("ja")) {
             
                larry.print();
                System.out.println();
                System.out.println("Drücke eine beliebige Taste um fortufahren:");
                sc.nextLine();
                abenteuer(sc, spieler, larry);

        } else if (choice.equalsIgnoreCase("nein")) {
            System.out.println("Dann kann dein Abenteuer losgehen!");
            abenteuer(sc, spieler, larry);
        
        } else { 
            System.out.println("Unglütige Eingabe.");
            System.exit(0);
        }

        System.out.println("Willst du diesen Larry bekämpfen? Falls du ihn besiegst wird er dir Hinweise über Winkys Fluchtweg geben.");
        System.out.println("Ja oder Nein?");

        String auswahlLarrybekämpfen = sc.nextLine();

        if (auswahlLarrybekämpfen.equalsIgnoreCase("ja")) {
        System.out.println("Du greift Larry an! Verursachter Schaden: " + spieler.getdamage());
        larry.sethealth(larry.gethealth() - spieler.getdamage());
        System.out.println();
        System.out.println("Larrys Leben: " + larry.gethealth() );
        System.out.println();
        
        System.out.println("Larry greift dich an! Verursachter Schaden: " + larry.getdamage());
        spieler.sethealth(spieler.gethealth() - larry.getdamage());
        System.out.println();
        System.out.println("Dein Leben " + spieler.gethealth());
        
        System.out.println("Du greift Larry an! Verursachter Schaden: " + spieler.getdamage());
        larry.sethealth(larry.gethealth() - spieler.getdamage());
        System.out.println();
        System.out.println("Larrys Leben: " + larry.gethealth() );
        System.out.println();
        
        if (larry.gethealth() <= 0) {
            System.out.println("Du hast Larry besiegt! Wie versprochen gibt er dir nun Informationen über Winkys fluchtweg.");
            System.out.println();
            larry.gebeInformationen();
        }
            
        
        } else if (auswahlLarrybekämpfen.equalsIgnoreCase("nein")) {
           System.out.println("Du gehst weiter.");
        } else { 
            System.out.println("Unglütige Eingabe");
            abenteuer(sc, spieler, larry);
        }

    }
}