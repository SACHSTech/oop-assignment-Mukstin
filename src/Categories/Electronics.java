package OnlineRetailer;
import java.io.*;
import java.util.ArrayList;

public class Electronics{

 private String electronicName; 
  
 private double price;

 public Electronics(String theElectronicName,double theprice){
   this.electronicName = theElectronicName;
   this.price = theprice;
 }

public String getElectronicName(){
  return this.electronicName;
}

public double getPrice(){
  return this.price;
}

}
