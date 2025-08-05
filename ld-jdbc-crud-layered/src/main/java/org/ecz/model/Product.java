package org.ecz.model;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id,String name,double price,int quality){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        if(name.length() == 0) {
            RuntimeException nameInvalidException=new RuntimeException("The name cannot be empty!");
            throw nameInvalidException;
        }

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuality(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public String toString(){
        return "product Details : " +
                "id = " + id + "\t"+
                 "name = " +name+"\t"+
                 "price= "+price+"\t"+
                  "quantity="+quantity;
    }
}
