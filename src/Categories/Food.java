package OnlineRetailer;
import java.io.*;
public class Food{
  public static String FoodString(String[] args)throws IOException{
 
   BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
 
   String Food = "";
   String Pizza = "1";
   String IceCream = "2";
   String Bacon = "3";
 
     System.out.println("1. "+Pizza+" - $15");
     System.out.println("2. "+IceCream+" - $4");
     System.out.println("3. "+Bacon+" - $4.47");
     System.out.println("Enter 1, 2, or 3 to choose an item");
     Food = key.readLine();
   
     return Food;
}
}
