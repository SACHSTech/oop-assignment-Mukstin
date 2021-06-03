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

}
