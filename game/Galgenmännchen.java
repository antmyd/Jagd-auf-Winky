package game;
import java.util.Random;
import java.util.Scanner;

public class Galgenmännchen {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
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

        int Versuche = 0;
        
        while (Versuche < 5) {

        Guess(sc, Wort);
        Versuche++;
        
    }
    
    System.out.println();
    System.out.println("Verloren!");
        
        }
        
       

         public static void Guess(Scanner sc, String Wort) {

             
            System.out.println();
            System.out.println("Gebe einen Buchstaben ein: ");
            String Buchstabe = sc.nextLine();
            
           
    
            

            if (Wort.contains(Buchstabe)) {
                System.out.println("Richtig!");
                
                
                for(int i = 0; i < Wort.length(); i++) {
                    if (Buchstabe.equals(Character.toString(Wort.charAt(i)))) {
                        System.out.print(Buchstabe);
                    } else {
                        System.out.print("_ ");
                    }
                    
                }

               return;

                
                
                
                
            } else {
                System.out.println("Falsch!");

                
                
                
                return;
                
                
            }
        
     
               
         }
        

       
}
