package game;
import java.util.Random;
import java.util.Scanner;

public class epischeKiste {
        Spieler spieler = new Spieler(null, 0, 0, null, 0, 0);
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        public void öffneEpischeKiste() {
    
            System.out.println("Drücke eine beliebige Taste um die Kiste zu öffnen...");
            sc.nextLine();
            System.out.println("Klack!...");
            int loot = rand.nextInt(0, 5);
    
        switch (loot) {
            case 0: 
            Heiltrank Heiltrankfass = new Heiltrank( 50, true);
            Inventar.addItem("Heiltrankfass");
            System.out.println("Du hast ein Heiltrankfass aus der Kiste erhalten!");
            System.out.println();
            break;
            case 1: 
            Waffe Frostaxt = new Waffe(100, "Frostaxt");
           
            Frostaxt.ausrüsten(spieler);
            //setweapon
            System.out.println("Du hast eine Frostaxt aus der Kiste erhalten!");
            break;
            case 2: 
            Rüstung Diamantrüstung = new Rüstung(50, "Diamantrüstung");
            Inventar.addItem("Diamantrüstung");
            //setrüstung
            System.out.println("Du hast eine Diamantrüstung aus der Kiste erhalten!");
            break;
            case 3:
            Waffe Feuerklinge = new Waffe(150, "Feuerklinge");
            
            Feuerklinge.ausrüsten(spieler);
            //setweapon
            System.out.println("Du hast eine Feuerklinge aus der Kiste erhalten!");
            
        }
    }
}
