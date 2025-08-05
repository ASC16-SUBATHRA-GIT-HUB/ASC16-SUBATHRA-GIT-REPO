package Collections;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class ArrayListx {
    //collection do not allow primitive
   // public static void main(String[] args) {
//

    private static void rawTypes(){
        ArrayList colorList=new ArrayList();
        colorList.add("red");
        colorList.add("Blue");
        colorList.add("Leavender");
        colorList.add(null);
        colorList.add("null");
        System.out.println(colorList);

       // ArithmeticException arithmeticException = new ArthimeticException("sample Exception");
      //  colorsList.add(arithmeticException);

    }

    private static void genericType(){
        ArrayList<String> colorList = new ArrayList<String>();
        colorList.add("red");
        colorList.add("Blue");
        colorList.add("Leavender");
        colorList.add(null);
        colorList.add("null");
//        System.out.println(colorList.get(2));
     //   ArithmeticException arithmeticException = new ArthimeticException("sample Exception");
//        colorList.add(arithmeticException.toString());
//        colorList.add(arithmeticException.toString());
        System.out.println(colorList);
//Collections don't allow primitives
        //Instead,use wrapper classes like Integer,Double,etc.
//        ArrayList<int> colorsList = new ArrayList<int>();
        ArrayList<Integer> integerList = new ArrayList<Integer>();
//        System.out.println((number,subList(10,2));
        integerList.add(10);
        integerList.add(30);
        integerList.add(null);
//        Iterator.iterator obj:HashNext(),next();
        System.out.println(integerList);
        ArrayList<Number> numberList = new ArrayList<Number>();
        numberList.add(2);
        numberList.add(3.0f);
        numberList.add(null);
        numberList.add(3.0000067d);
        System.out.println(numberList);
        //autobox
        int i=9;
        numberList.add(i);
        // implictly boxing
        Integer p=Integer.valueOf(i);
        numberList.add(p);
        System.out.println(numberList);

    }

    public static void workingWithArrayList() {
        ArrayList<String> shoppingCartList = new ArrayList<String>();
        shoppingCartList.add("Man's search For Meaning");
        shoppingCartList.add("Start with why?");
        shoppingCartList.add("Java");
        shoppingCartList.add("Start with why?");
        shoppingCartList.add("Deep Work");
        shoppingCartList.set(1,"starts walking -west");
        System.out.println("1"+shoppingCartList.get(1));
        System.out.println(shoppingCartList);
        System.out.println(shoppingCartList.remove(3));

    }

    public static void main(String[] args){
        rawTypes();
        genericType();
        workingWithArrayList();

    }
}