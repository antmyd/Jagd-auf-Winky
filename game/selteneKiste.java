package game;
import java.util.Random;
import java.util.Scanner;

public class selteneKiste {
        Spieler spieler = new Spieler(null, 0, 0, null, 0, 0);
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        public void öffneSelteneKiste() {
    
            System.out.println("Drücke eine beliebige Taste um die Kiste zu öffnen...");
            sc.nextLine();
            System.out.println("Klack!...");
            int loot = rand.nextInt(0, 5);
    
        switch (loot) {
            case 0: 
            Heiltrank seltenerHeiltrank = new Heiltrank(20, false);
            Inventar.addItem("seltener Heiltrank");
            System.out.println("Du hast ein Heiltrank aus der Kiste erhalten!");
            System.out.println();
            break;
            case 1: 
            Waffe Goldschwert = new Waffe(50, "Goldschwert");
            Goldschwert.ausrüsten(spieler);
            System.out.println("Du hast ein Goldschwert aus der Kiste erhalten!");
            break;
            case 2: 
            Rüstung Holzrüstung = new Rüstung(25, "Holzrüstung");
            Inventar.addItem("Holzrüstung");
            //setrüstung
            System.out.println("Du hast eine Holzrüstung aus der Kiste erhalten!");
            break;
            
        }
    }
}
