package com.demo.access_modifiers.p1;

public class P1C1 {
    private String privatevar;
    private void privateMethod()
    {
        System.out.println(privatevar);
    }
    public static void main(String[] args)
    {
        P1C1 p1C1=new P1C1();
        System.out.println(p1C1.privatevar);
        p1C1.privateMethod();
    }
}
