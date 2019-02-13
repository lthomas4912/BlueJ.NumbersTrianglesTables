 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
       String result = "";
        for(int i = 1; i <= 5; i++){
           
            for(int j = 1; j <= 5; j++){

                int loop = (i*j);
                result += String.format("%3d |",loop);
                
            }
            result += "\n";
        
    }return result;
        
        
        
    }
        

    public static String getLargeMultiplicationTable() {
         String result = "";
        for(int i = 1; i <= 10; i++){
           
            for(int j = 1; j <= 10; j++){

                int loop = (i*j);
                result += String.format("%3d |",loop);
                
            }
            result += "\n";
        
    }return result;
}
    

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for(int i = 1; i <= 20; i++){
           
            for(int j = 1; j <= 20; j++){

                int loop = (i*j);
                result += String.format("%3d |",loop);
                
            }
            result += "\n";
        
    }return result;
    }
}
