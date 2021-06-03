package OnlineRetailer;
 
import java.io.*;
 
/**
- Main file that runs the system.
@Justin Ho Shue
**/
 
public class Main {
 
 public static void main(String[] args) throws IOException{
    
   BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
 
  Games games = new Games();
  Electronics electronics = new Electronics();
  Food food = new Food();

   String Category = "";
   String Games = "1";
   String Electronics = "2";
   String Food = "3";
 
   System.out.println("Welcome to the OnlineRetailer");
    while(!Category.equalsIgnoreCase("Done")){
     System.out.println("how may we help you?");
     System.out.println("1. Games");
     System.out.println("2. Electronics");
     System.out.println("3. Food");
     System.out.println("Enter 1,2, or 3 to choose a category, type Done when your ready to checkout");
     Category = key.readLine();
 
     if(Category.equals("1")) {

       System.out.println(games.GameString());

     } else if (Category.equals("2")) {

       System.out.println(electronics.ElectronicString());

     } else if (Category.equals("3")) {

       System.out.println(food.FoodString());
     }
 }

      
 }
}
