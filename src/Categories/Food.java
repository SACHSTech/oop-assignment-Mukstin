package OnlineRetailer;
import java.io.*;
import java.util.ArrayList;
public class Food{

 private String foodName; 
  
 private double price;

 public Food(String theFoodName,double theprice){
   this.foodName = theFoodName;
   this.price = theprice;
 }

public String getFoodName(){
  return this.foodName;
}

public double getPrice(){
  return this.price;
}

}
