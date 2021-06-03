package OnlineRetailer;
 
import java.io.*;
import java.util.ArrayList;
/**
- Main file that runs the system.
@Justin Ho Shue
**/
 
public class Main {
 
 public static void main(String[] args) throws IOException{
    
   BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    Games minecraft = new Games("Minecraft", 35);
    Games overwatch = new Games("overwatch", 20);
    Games theForest = new Games("theForest", 15);
    Food pizza = new Food("pizza", 15);
    Food iceCream = new Food("iceCream", 4);
    Food bacon = new Food("bacon", 4.47);
    Electronics ps5 = new Electronics("ps5", 399);
    Electronics laptop = new Electronics("laptop", 899);
    Electronics tv = new Electronics("tv", 1398);

    ArrayList<Games> purchasedGames = new ArrayList<Games>();
    ArrayList<Food> purchasedFood = new ArrayList<Food>();
    ArrayList<Electronics> purchasedElectronics = new ArrayList<Electronics>();

   String Category = "";
   String Games = "1";
   String Electronics = "2";
   String Food = "3";
   double subTotal = 0;
   double total;
   double tax;

   System.out.println("Welcome to the OnlineRetailer");
    while(!Category.equalsIgnoreCase("Done")){
     System.out.println("how may we help you?");
     System.out.println("1. Games");
     System.out.println("2. Electronics");
     System.out.println("3. Food");
     System.out.println("Enter 1,2, or 3 to choose a category, type Done when your ready to checkout");
     Category = key.readLine();
 
     if(Category.equals("1")) {
        System.out.println("1. Minecraft - $35");
        System.out.println("2. Overwatch - $20");
        System.out.println("3. TheForest - $15");
        System.out.println("Enter 1, 2, or 3 to choose an item");
        Category = key.readLine();

     if(Category.equals("1")) {

        purchasedGames.add(minecraft);

       } else if (Category.equals("2")) {

        purchasedGames.add(overwatch);

       } else if (Category.equals("3")) {
       
        purchasedGames.add(theForest);
       }
       
       } else if (Category.equals("2")) { 
          System.out.println("1. ps5 - $399");
          System.out.println("2. laptop - $899");
          System.out.println("3. tv - $1398");
          System.out.println("Enter 1, 2, or 3 to choose an item");
          Category = key.readLine();

       if(Category.equals("1")) {

        purchasedElectronics.add(ps5);

       } else if (Category.equals("2")) {

        purchasedElectronics.add(laptop);

       } else if (Category.equals("3")) {
       
        purchasedElectronics.add(tv);
       }

       } else if (Category.equals("3")) {
          System.out.println("1. pizza - $15");
          System.out.println("2. iceCream - $4");
          System.out.println("3. bacon - $4.47");
          System.out.println("Enter 1, 2, or 3 to choose an item");
          Category = key.readLine();
      if(Category.equals("1")) {

        purchasedFood.add(pizza);

       } else if (Category.equals("2")) {

        purchasedFood.add(iceCream);

       } else if (Category.equals("3")) {
       
        purchasedFood.add(bacon);
       }
     }
    }
    for (int i = 0; i < purchasedGames.size(); i++){
        System.out.print(purchasedGames.get(i).getGameName()+" $");
        System.out.println(purchasedGames.get(i).getPrice());   
        subTotal += purchasedGames.get(i).getPrice(); 
    }
    for (int i = 0; i < purchasedFood.size(); i++){
        System.out.print(purchasedFood.get(i).getFoodName()+" $");
        System.out.println(purchasedFood.get(i).getPrice()); 
        subTotal += purchasedFood.get(i).getPrice();   
    }
    for (int i = 0; i < purchasedElectronics.size(); i++){
        System.out.print(purchasedElectronics.get(i).getElectronicName()+" $");
        System.out.println(purchasedElectronics.get(i).getPrice());  
        subTotal += purchasedElectronics.get(i).getPrice();  
    }
      //calculates the tax and the total
      tax = subTotal*0.13;
      total = subTotal + tax;
      //prints the subtotal,tax,total
      System.out.println("Subtotal: "+subTotal);
      System.out.println("Tax: "+tax);
      System.out.println("Total: "+total);
 }
}
