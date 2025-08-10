package Assignment;
import java.util.*;

public class Array {
    int[] a = {9, 2, 2, 9, 10, 9, 5, 3, 2, 1};

    void display() {
        System.out.print("For: ");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i] + " ");
        System.out.println("\nWhile:");
        int i = 0;
        while (i < a.length)
            System.out.println(a[i++] + " ");
        System.out.println();
    }
    void sortArray(){
    Arrays.toString(a);
        System.out.println("Sorted: " +Arrays.toString(a));
    }
    int count(int x){
        int c = 0;
        for(int i=0;i<a.length;i++)if(a[i]==x)c++;
        return c;
    }
    void insertAt(int num,int pos){
        int[] b= new int[a.length+1];
        for(int i=0;i<b.length;i++){
            if(i<pos) b[i]=a[i];
            else if(i == pos) b[i]=num;
            else b[i] = a[i-1];
        }
        a = b;
        System.out.println("After Insert:"+Arrays.toString(a));
    }
    void showUnique(){
        ArrayList<Integer> u=new ArrayList<>();
        for(int i=0;i<a.length;i++)
            if(!u.contains(a[i])) u.add(a[i]);
        System.out.println("Unique: " + u);
    }
    public static void main(String[] args){
        Array obj = new Array();
        obj.display();
        obj.sortArray();
        System.out.println("9 appears " + obj.count(9)+"times");
        obj.insertAt(7,3);
        obj.showUnique();
    }
}