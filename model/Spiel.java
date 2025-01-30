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

        if (choice.equalsIgnoreCase("ja")) {
             Spieler spieler = new Spieler(name, 50, 0, "Faust");  // Beispiel Initialisierung
                spieler.print(); 

        } else if (choice.equalsIgnoreCase("nein")) {
            System.out.println("Dann kann dein Abenteuer losgehen!");
            abenteuer();
        
        } else { 
            System.out.println("Unglütige Eingabe.");
            System.exit(0);
        }
    }
    
        public static void abenteuer() {
        System.out.println("Du betrittst den Eingang der Grube");
    }
}