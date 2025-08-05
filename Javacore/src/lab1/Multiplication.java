package lab1;

public class Multiplication {
    static void tableFor(int n) {

        for (int i = 1; i <= 10;i++ )
            System.out.println(n + "x" + i + "=" + (n * i));
    }
    static void tableWhile(int n){
        int i=0;
        while (i<=10){
            System.out.println(n+"x"+i+"="+n*i);
            i++;
        }
    }
    public static void main(String[] args) {
        Multiplication s = new Multiplication();
        s.tableWhile(2);
    }
}

