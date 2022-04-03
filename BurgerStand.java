 * @author afiqhafiz
 */
public class BurgerStand {
    private int stallID = 0;
    private int burgerSold = 0;
    private static int totalBurgerSold = 0;
    
    public BurgerStand (int initialID, int initialSold){
    stallID = initialID;
    burgerSold = initialSold;
    totalBurgerSold += initialSold;
}
    
    public void justSold(){
        burgerSold++;
        totalBurgerSold++;
    }
    
    public static int getTotalBurgerSold(){
        return totalBurgerSold;
    }
    
    public int getBurgerSold(){
        return burgerSold;
    }
    
    
    public int getStallID(){
        return stallID;
    }
 
    public static void main(String[] args) {
        BurgerStand afiq1 = new BurgerStand (1, 1);
        BurgerStand afiq2 = new BurgerStand (2, 1);
        BurgerStand afiq3 = new BurgerStand (3, 1);
        
        afiq2.justSold();
        
        afiq3.justSold();
        afiq3.justSold();
        
        System.out.println("Burger stall ID: " + afiq1.getStallID() + " " + "Burger Sold: " + afiq1.getBurgerSold());
        System.out.println("Burger stall ID: " + afiq2.getStallID() + " " + "Burger Sold: " + afiq2.getBurgerSold());
        System.out.println("Burger stall ID: " + afiq3.getStallID() + " " + "Burger Sold: " + afiq3.getBurgerSold());
        
        System.out.println("Total burger sold for all stall is " + BurgerStand.getTotalBurgerSold());
    }
}
