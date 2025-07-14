package Assign2;

public class Welcome {
    public static String welcomeMessage(String name){
        return "Hello" + name + ",Welcome to Java World!";
    }

    public static void main(String[] args) {
        String message=welcomeMessage("suba");
        System.out.println(message);
    }
}
