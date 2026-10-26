
package Array;

import java.util.ArrayList;


public class Array {
 
   
    public static Integer max(ArrayList<Integer> list){
        
        if(list.isEmpty() || list==null){
            
            return null;
        }
        
        else{
          return   java.util.Collections.max(list);
        }
        
      
    } 
    
}
