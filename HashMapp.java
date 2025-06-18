
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapp {

    public static void main(String[] args) {
        //Creating a new HashMap

        //country(key),population(value)
        HashMap<String, Integer> hm = new HashMap<>();

        //insert ->put(key, value)
        hm.put("India", 20000);
        hm.put("Usa", 300);
        hm.put("China", 1500);
        hm.put("China", 1800);//updates the value of the same key

        //Printing
        System.out.println(hm);
        //output is not in any order and random
        //{Usa=300, China=1800, India=20000} 

        //Search in hash map // Contains 
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("india"));//false lowercase
        System.out.println(hm.containsKey("Dubai"));//false

        //get value with key 
        System.out.println(hm.get("India"));//20000 
        System.out.println(hm.get("Dubai"));//null

        //Traversal of Hashmap
        //for(Map.Entry<Integer, Integer> e=Map.entrySet()){};
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e);
        }

        //only keys looping through HashMap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        hm.remove("China");
        System.out.println(hm);
    }
}
