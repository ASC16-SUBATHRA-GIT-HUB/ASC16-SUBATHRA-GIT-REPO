package com.demo.shopping_App.Model;

public class product {
    String name;
    double price;
    public product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public void display()
    {
        System.out.println("Product:" +this.name+",price: $" +this.price);
    }
}
