package com.demo.practice.p2;
import com.demo.practice.p1.Animal;
public class  Dog extends Animal {
    public void method()
    {
       subMethod();
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Dog dog=new Dog();
        dog.method();

    }
}
