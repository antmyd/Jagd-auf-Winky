package game;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Galgenmännchen {

    private static int Versuche = 10;

    public Galgenmännchen(int Versuche) {
        this.Versuche = Versuche;

       
    }

    public static int getVersuche() {
        return Versuche;
    }
    
         
        
        
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        String[] Wörter = {"goldmünzen", "fackel", "winky", "spinne", "riese", "schwert", "heiltrank", "dunkelheit", "schloss", "larry", "wald"};
        int zufallsgenerator = rand.nextInt(0, 11);
        String Wort = Wörter[zufallsgenerator];
        ArrayList <String> errateneBuchstaben  = new ArrayList<>();





        



        
            
        

        System.out.println("Willkommen zu Galgenmännchen!");

        System.out.println("Das gesuchte Wort: ");

        for(int i = 0; i < Wort.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();
        System.out.println("Du hast " + getVersuche() + " Versuche");
        System.out.println();

        
        
        while (Versuche > 0) {

            System.out.print("                   Willst du das Wort direkt erraten? Ja/Nein?");
            

            String auswahl = sc.nextLine();

            if (auswahl.equalsIgnoreCase("ja")) {
                System.out.println("Gebe das Wort ein: ");
                String rateWort = sc.nextLine();

                if (rateWort.equalsIgnoreCase(Wort)) {
                    System.out.println("Richtig! Du hast gewonnen.");
                    return;

                } else {
                    System.out.println("Falsch! Du hast 3 Versuche verloren!");
                    Versuche = getVersuche() - 3;
                }
    
            } else if (auswahl.equalsIgnoreCase("nein")) {
                //Spieler möchte Buchstabe für Buchstabe
                System.out.println();
                System.out.print("Gebe einen Buchstaben ein: ");
                System.out.print("                    Deine Versuche: " + getVersuche());
                System.out.println();
                String Buchstabe = sc.nextLine();
                Buchstabe = Buchstabe.toLowerCase();

                if (Wort.contains(Buchstabe)) {
                    System.out.println("Richtig!");
                    System.out.println();

                    if (!errateneBuchstaben.contains(Buchstabe)) {
                        errateneBuchstaben.add(Buchstabe);
                    }
                    
                    
                    zeigFortschritt(Wort, errateneBuchstaben);

                    
                } else {
                    System.out.println("Falsch!");
                    System.out.println(); 
                    Versuche = getVersuche() - 1;
                    zeigFortschritt(Wort, errateneBuchstaben);
    
    
                }
    
    
            }
        
        
    
        }       
            


        System.out.println();
        System.out.println("Verloren!");
        System.out.println("Das gesuchte Wort war " + Wort);


    
    }

    public static void zeigFortschritt(String Wort, ArrayList<String> errateneBuchstaben) {
        for(int i = 0; i < Wort.length(); i++) {
            boolean found = false;
            for(int j = 0; j < errateneBuchstaben.size(); j++) {
                String aktuellerBuchstabe = errateneBuchstaben.get(j);

                if (aktuellerBuchstabe.equalsIgnoreCase(Character.toString(Wort.charAt(i)))) {
                    System.out.print(" " + aktuellerBuchstabe);
                    found = true;
                }
    
            }

            if (!found) {
                System.out.print(" _");
            }
        }
    }

}
