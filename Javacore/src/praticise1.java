import java.security.Key;
import java.util.*;
public class praticise1 {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();
        //Insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.get("India");

        //Get o(1)
        int population = hm.get("India");
        System.out.println(hm.get("Indonesia"));
        System.out.println(population);

        //ContainsKey-0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("indonesia"));

        //RemoveKey-0(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //IsEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
