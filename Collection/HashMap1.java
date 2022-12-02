package Collection.linklist;

import java.util.*;


public class  HashMap1{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(1,"Grapes");//trying duplicate key
   map.put(null, null);
   map.put(null, "watermelon");
   map.putIfAbsent(5, "papaya");
   map.putIfAbsent(2, "JackFruit");
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue()); 
    System.out.println(map);
    System.out.println(map.keySet());//only key
    System.out.println(map.entrySet());//entry values
    System.out.println(map.values());
   }  
}  
}  

//Linked HashMap is same as HashMap it shows the output according to insertion order.

//TreeMap is same as HashMap but it does not accept null values and shows the output according to insertion order.
