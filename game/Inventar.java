package game;
import game.Spieler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Inventar {

        static ArrayList<String> inventar = new ArrayList<String>();

        public static void addItem(String item) {

           inventar.add(item);
        }
        
        public void setItemInventory() {
            inventar.set(0, null);
        }
    
        public void  showInventory() {
            System.out.println("========== Inventar ==========");
        
            if (inventar.size() == 0) {
                System.out.println("Du hast keine Items im Inventar.");
                
            }
        
            String inventoryList = "";
        
            for (int i = 0; i < inventar.size(); i++) {
                inventoryList += "- " + inventar.get(i);
            }
        
            System.out.println(inventoryList);
        }
        
        
        public void removeItem() {
            
            inventar.remove(0);
        }
    
        public void clearAllItems() {
            inventar.clear();
        
    
    }
    
    }
    

        


    

