package Assign2;

import java.util.Scanner;

public class Largest {
    public static int largest(int a,int b,int c) {
        if(a >= b && a >= c){
            return a;
        }
        else if(b >= a && b >= c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the first number:");
        int number1=scanner.nextInt();

        System.out.println("Enter the Second number:");
        int number2=scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3=scanner.nextInt();
//        int num1 = 45;
//        int num2 = 98;
//        int num3 = 66;
        int largest = largest(number1, number2, number3);
        System.out.println("The Largest no is: " +largest);
        scanner.close();
    }
}
