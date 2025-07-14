package Assign2;

import java.util.Scanner;

public class Digit {
    public static void print(int number) {
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String numstr = String.valueOf(number);
        for (char digit : numstr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }

    }
        public static void main (String[] args){
//            Scanner scanner = new Scanner(System.in);

//            System.out.println("enter the first word:");
//            int word1 = scanner.nextInt();
//
//            System.out.println("enter the second word:");
//            int word2 = scanner.nextInt();
//
//            System.out.println("enter the third word:");
//            int word3 = scanner.nextInt();

            Digit digit = new Digit();
            digit.print(951);

            // String word = print(word1, word2, word3);
            //System.out.println("The words are :");
//            scanner.close();

        }
    }
