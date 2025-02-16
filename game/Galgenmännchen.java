package game;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Galgenmännchen implements Game{

    private static int Versuche = 10;

    public Galgenmännchen(int Versuche) {
        this.Versuche = Versuche;

       
    }

    public static int getVersuche() {
        return Versuche;
    }
    
         
        
        
    public static void main(String[] args) {
        
       spiel();

       


    
    }

   

    public static void spiel() {
        Spieler spieler = new Spieler(null, 50, 0, null, 10, 0);
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        String[] Wörter = {"goldmünzen", "fackel", "winky", "spinne", "riese", "schwert", "heiltrank", "dunkelheit", "schloss", "larry", "wald"};
        int zufallsgenerator = rand.nextInt(0, 11);
        String Wort = Wörter[zufallsgenerator];
        
        ArrayList <String> errateneBuchstaben  = new ArrayList<>();
        ArrayList <String> arrayVomWort  = new ArrayList<>();

        arrayVomWort.add(Wort);

        





        



        
            
        

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
                    
                    
                    zeigeFortschritt(Wort, errateneBuchstaben, arrayVomWort);

                    
                } else {
                    System.out.println("Falsch!");
                    System.out.println(); 
                    Versuche = getVersuche() - 1;
                    zeigeFortschritt(Wort, errateneBuchstaben, arrayVomWort);
    
    
                }
                 /*if (errateneBuchstaben.equals(Wort)) {
                    System.out.println("Gewonnen!");
                    return;
                 }*/
    
            }
        
        
    
        }       
            


        System.out.println();
        System.out.println("Verloren!");
        System.out.println("Das gesuchte Wort war " + Wort);
        spieler.sethealth(spieler.gethealth() - 5);
    }

    public static void zeigeFortschritt(String Wort, ArrayList<String> errateneBuchstaben, ArrayList<String> arrayVomWort) {
        for(int i = 0; i < Wort.length(); i++) {
            boolean found = false;
            for(int j = 0; j < errateneBuchstaben.size(); j++) {
                String aktuellerBuchstabe = errateneBuchstaben.get(j);

                if (aktuellerBuchstabe.equalsIgnoreCase(Character.toString(Wort.charAt(i)))) {
                    System.out.print(" " + aktuellerBuchstabe);
                    found = true;
                }
                if (errateneBuchstaben.size() == arrayVomWort.size())  {
                    if(errateneBuchstaben.equals(arrayVomWort)) {
                        System.out.println("Gewonnen!");
                        return;
                    }
                }
               
    
            }

            if (!found) {
                System.out.print(" _");
            }
        }
    }

    

}
