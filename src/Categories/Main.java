package OnlineRetailer;
 
import java.io.*;
 
/**
- Main file that runs the system.
@Justin Ho Shue
**/
 
public class Main {
 
 public static void main(String[] args) throws IOException{
    
   BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
 
   int category = 0;
   String Games = "1";
   String Electronics = "2";
   String Food = "3";
 
   System.out.println("Welcome to the OnlineRetailer");
 
     System.out.println("how may we help you?");
     System.out.println("1. "+Games);
     System.out.println("2. "+Electronics);
     System.out.println("3. "+Food);
     System.out.println("Enter 1,2, or 3 to choose a category, type Done when your ready to checkout");
     category = Integer.parseInt(key.readLine());
 
     if(category == 1){
       System.out.println(GameString());
     } else if (category == 2){
       System.out.println(ElectronicString());
     } else if (category == 3){
       System.out.println(FoodString());
     }
 
 }
}
