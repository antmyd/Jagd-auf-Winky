package game;
import java.util.Random;
import java.util.Scanner;

public class Galgenmännchen {

    private static int Versuche = 5;

    public Galgenmännchen(int Versuche) {
        this.Versuche = Versuche;

       
    }

    public static int getVersuche() {
            return Versuche;
         }
    
         
        
        
         public static void main(String[] args) {
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);
            
            Galgenmännchen spiel = new Galgenmännchen(Versuche);
            
            String[] Wörter = {"Goldmünzen", "Fackel", "Winky", "Spinne", "Riese", "Schwert", "Heiltrank", "Dunkelheit", "Schloss", "Larry", "Wald"};
            int zufallsgenerator = rand.nextInt(0, 11);
            
            String Wort = Wörter[zufallsgenerator];
    
            
               
            
    
            System.out.println("Willkommen zu Galgenmännchen!");
    
            System.out.println("Das gesuchte Wort: ");
    
            for(int i = 0; i < Wort.length(); i++) {
                System.out.print("_ ");
            }
            System.out.println();
            System.out.println("Du hast 5 Versuche, das Wort zu erraten.");
    
            
            
            while (Versuche > 0) {
    
                wortDirektErraten(spiel, sc, Wort, Versuche);
                
                System.out.println();
                System.out.print("Gebe einen Buchstaben ein: ");
                System.out.print("                    Deine Versuche: " + getVersuche());
                System.out.println();
                String Buchstabe = sc.nextLine();
            
           
    
            

            if (Wort.contains(Buchstabe)) {
                System.out.println("Richtig!");
                System.out.println();
                Versuche = getVersuche();
                System.out.println();
                
                
                for(int i = 0; i < Wort.length(); i++) {
                    if (Buchstabe.equalsIgnoreCase(Character.toString(Wort.charAt(i)))) {
                        System.out.print(Buchstabe);
                    } else {
                        System.out.print("_ ");
                    }
                    
                }

               

                
                
                
                
            } else {
                System.out.println("Falsch!");
                System.out.println();
                Versuche = getVersuche() - 1;

                
                
                
                
        
        }
        
       

        
        
    }
    
    
    System.out.println();
    System.out.println("Verloren!");

            
       

        
             

            
                
                
            
        
    }
               
    public static void wortDirektErraten(Galgenmännchen spiel, Scanner sc, String Wort, int Versuche) {

       

        
        System.out.println("Willst du das Wort direkt erraten? Ja/Nein?");

        String auswahl = sc.nextLine();

        if (auswahl.equalsIgnoreCase("ja")) {
           System.out.println("Gebe das Wort ein: ");
           String rateWort = sc.nextLine();

           if (rateWort.equalsIgnoreCase(Wort)) {
               System.out.println("Richtig! Du hast gewonnen.");
               
               System.exit(0);
               

           } else {
               System.out.println("Falsch! Du hast 3 Versuche verloren!");
               Versuche = spiel.getVersuche() - 3;
           }
        } else if (auswahl.equalsIgnoreCase("nein")) {
                
        }
         
     }

        

       
}
