 
import java.util.Scanner;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
     String star = "*";
     String result = "";
      for(int width = 1; width <= numberOfStars; width++){
        
         result += star;
        } 
     
     
       return result;
    
    }
          
    
    public static String getTriangle(int numberOfRows) {
        
        String result = "";
        
        for(int i = 0 ; i < numberOfRows; i++){
            for(int j = 0; j <= i; j++){
                
               result = result + "*";
             
               
             
              
            } result = result + "\n";
        }return result;
        
        
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
