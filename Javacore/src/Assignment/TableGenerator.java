package Assignment;

public class TableGenerator {
    static void tableFor(int n){

        for(int i=1;i<=10;)
            System.out.println(n+"x"+i+"="+(n*i++));
    }
    static void tableWhile(int n){
        int i=1;
        while(i<=10){
            System.out.println(n+"x"+i+"="+(n*i));
            i++;
        }
    }
    static void tableDoWhile(int n){
        int i=1;
        do{
            System.out.println(n+"x"+i+"="+(n*i));
            i++;
        }while(i<=10);
    }
    public static void main(String[] args){
        int input=2;
        System.out.println("using for loop:");
        tableFor(input);
        System.out.println("\n using while loop:");
        tableWhile(input);
        System.out.println("\n using do-while loop:");
        tableDoWhile(input);

    }
}
