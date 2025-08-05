package Collections;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Object,Object> map=new HashMap<>();
        Laptop laptop1=new Laptop("dell",90);
        Laptop laptop2=new Laptop("intel",80);
        map.put("dell",laptop1);
        map.put("intel",80);
        String laptopBrand="Lenovo";
        map.put(laptopBrand,laptop2);
        map.put("Hp",new Laptop("pavillion",10));
        map.put("null",new Laptop("Tuf",10));
        map.put(null,new Laptop("Rog",10));
        map.put("null",new Laptop("MacBook",10));
        map.put("Sony",new Laptop("viao",10));
        System.out.println(map);
    //Using the iterate
        System.out.println("**********************");
        for(Object value : map.values()){
            System.out.println(value);
        }
    }
}

class Laptop{
    String name;
    int price;
    public Laptop(String name,int price){
        this.name=name;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Laptop[laptopName: " +name+ ", price: "+price;
    }
}