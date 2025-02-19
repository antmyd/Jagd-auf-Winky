package game;
import java.util.Arrays;
import java.util.Scanner;

public class Playground {

    public Playground() {}

    
    Spieler spieler = new Spieler(null, 0, 0, null, 0, 0);
    Enemy enemy = new Enemy(null, 0, 0, 0, null);
    Scanner sc = new Scanner(System.in);
        
    
    
    
    public static void start(Scanner sc, Spieler spieler, Enemy enemy) {
        String[] waffen = {"1.Feuerklinge", "2.Frostaxt", "3.BlutKlinge", "4.mythisches Diamantschwert", "5.Admin-Schwert" };
        System.out.println("System.out.println(\"========== PLAYGROUND ==========\");");
        System.out.println();
        System.out.println("Wähle deine Ausrüstung");
        System.out.println("Waffen: " + Arrays.toString(waffen));
        int auswahl = sc.nextInt();
        
        switch (auswahl) {  // Umwandeln in Kleinbuchstaben
            case 1:
            Waffe Feuerklinge = new Waffe(150, "Feuerklinge");
            Feuerklinge.ausrüsten(spieler);
                break;
            case 2:
            Waffe Frostaxt = new Waffe(150, "Frostaxt");
            Frostaxt.ausrüsten(spieler);
                break;
            case 3:
            Waffe Blutklinge = new Waffe(200, "Blutklinge");
            Blutklinge.ausrüsten(spieler);
                break;
            case 4:
            Waffe Diamantenschwert = new Waffe(500, "Diamantenschwert");
            Diamantenschwert.ausrüsten(spieler);
                break;
            case 5:
            Waffe Adminschwert = new Waffe(enemy.gethealth(), "Adminschwert");
            Adminschwert.ausrüsten(spieler);
                break;
            default:
                System.out.println("Unbekannte Waffe! Wähle eine gültige Waffe.");
        }

        String[] rüstung = {"1.Holzrüstung", "2.nerfer", "3.Titanenrüstung", "4.Umhang der Unsterblichkeit"};
        System.out.println("System.out.println(\"========== PLAYGROUND ==========\");");
        System.out.println();
        System.out.println("Wähle deine Ausrüstung");
        System.out.println("Rüstungen: " + Arrays.toString(rüstung));
        int auswahl1 = sc.nextInt();
        
        switch (auswahl1) {  // Umwandeln in Kleinbuchstaben
            case 1:
            Rüstung Holzrüstung = new Rüstung(20, "Holzrüstung");
            Holzrüstung.rüstungAufsetzen(spieler);
                break;
            case 2:
            Rüstung Nerfer = new Rüstung(0, "Nerfer");
            Nerfer.rüstungAufsetzen(spieler);
                break;
            case 3:
            Rüstung Titanenrüstung = new Rüstung(500, "Titanenrüstung");
            Titanenrüstung.rüstungAufsetzen(spieler);
                break;
            case 4:
            Rüstung UmhangDerUnsterblichkeit = new Rüstung(10000, "UmhangDerUnsterblichkeit");
            UmhangDerUnsterblichkeit.rüstungAufsetzen(spieler);
                break;
            default:
                System.out.println("Unbekannte Rüstung! Wähle eine gültige Rüstung.");
        }

      System.out.println("Wähle deinen Gegner aus: ");
      System.out.println("1. Golem ");
      System.out.println("2. Trainingsdummy");
      System.out.println("3. Riese");
      System.out.println("4. Spinne");
      System.out.println("5. Larry");
      System.out.println("6. gebuffter Larry");

      int auswahl3 = sc.nextInt();

      switch (auswahl3) {  // Umwandeln in Kleinbuchstaben
        case 1:
        Enemy golem = new Enemy("Golem", 50, 1000, 0, null);
        spieler.fight(spieler, golem);
            break;
        case 2:
        Riese riese = new Riese();
        spieler.fight(spieler, riese);
            break;
        case 3:
        Spinne spinne = new Spinne();
        spieler.fight(spieler, spinne);
            break;
        case 4:
        Enemy gebuffterLarry = new Enemy("gebuffterLarry", 1000, 5000, 0, null);
        spieler.fight(spieler, gebuffterLarry);
            break;
        default:
            System.out.println("Unbekannte Rüstung! Wähle eine gültige Rüstung.");
    }


      

        
    }


    }

