package OnlineRetailer;
import java.io.*;
public class Games{
 
 public static String GameString()throws IOException{
 
   BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
 
   String Games = "";
   String Minecraft = "1";
   String Overwatch = "2";
   String TheForest = "3";
  
     System.out.println("1. Minecraft - $35");
     System.out.println("2. Overwatch - $20");
     System.out.println("3. TheForest - $15");
     System.out.println("Enter 1, 2, or 3 to choose an item");
     Games = key.readLine();
 
     return Games;
 }
}
