package OnlineRetailer;
import java.io.*;
public class Games{

 private String gameName; 
  
 private double price;

 public Games(String theGameName,double theprice){
   this.gameName = theGameName;
   this.price = theprice;
 }

public String getGameName(){
  return this.gameName;
}

public double getPrice(){
  return this.price;
}

/*
 public static String GameString()throws IOException{
 
   BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
 
   String Games = "";
   String minecraft = "1";
   String overwatch = "2";
   String theForest = "3";
  
     System.out.println("1. Minecraft - $35");
     System.out.println("2. Overwatch - $20");
     System.out.println("3. TheForest - $15");
     System.out.println("Enter 1, 2, or 3 to choose an item");
     Games = key.readLine();
 
     return Games;
 }
*/
}
