package OnlineRetailer;
import java.io.*;
public class Electronics{
 
 public static String ElectronicString() throws IOException{
 
   BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
 
     String Electronics = "";
     String PS5 = "1";
     String Laptop = "2";
     String TV = "3";
 
     System.out.println("1. PS5 - $399");
     System.out.println("2. Laptop - $899");
     System.out.println("3. TV - $1398");
     System.out.println("Enter 1, 2, or 3 to choose an item");
     Electronics = key.readLine();
 
     return Electronics;
 }
}
