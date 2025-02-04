package game;
import game.Spieler;

import java.util.ArrayList;
import java.util.List;

public class Inventar {
    
public static void main(String[] args) {
    
}
        Spieler spieler = new Spieler(null, 0, 0, null);
        
        static ArrayList<String> inventar = new ArrayList<String>();

        public static void addItem(String string) {
            inventar.add(string);
        }
        
        public static void setItemInventory() {
            inventar.set(0, null);
        }
    
        public static void showInventory() {
            for(int i = 0; i<inventar.size(); i++) {
               
                System.out.println(inventar.get(i));
             }
    
        }
        public static void removeItem() {
            
            inventar.remove(0);
        }
    
        public static void clearAllItems() {
            inventar.clear();
        }
    
    }
    
   


    

