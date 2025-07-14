package Assignment;

public class Methods {
    public void getCharAt (String str){
        System.out.println(str.charAt(1));
    }
    public void getContains(String str) {
        System.out.println(str.contains("s"));
    }
    public void getLength(String str){
        System.out.println(str.length());
    }
    public void getindexOf(String str){
        System.out.println(str.indexOf('o'));
    }
    public void getequals(String str1,String str2){
        System.out.println(str1.equals(str2));
    }
    public void getequalsIsIgnoreCase(String str1,String str2){
        System.out.println(str1.equalsIgnoreCase(str2));
    }
    public void getjoin(String str1,String str2){
        System.out.println(str1.join(str2));
    }
    public void getlastIndexOf(String str){
        System.out.println(str.lastIndexOf("g"));
    }
    public void getsubstring(String str){
        System.out.println(str.substring(3));
    }
    public void gettoLowerCase(String str){
        System.out.println(str.toLowerCase());
    }
    public void gettoUpperCase(String str){
        System.out.println(str.toUpperCase());
    }
    public void gettrim(String str){
        System.out.println(str.trim());
    }
    public static void main(String[] args) {
        Methods m=new Methods();
        m.getCharAt("suba");
        m.getContains("s");
        m.getLength("cluny");
        m.getindexOf("hello");
        m.getequals("suba","abus");
        m.getequalsIsIgnoreCase("suba","suba");
        m.getjoin("cluny","suba");
        m.getlastIndexOf("vigytvytvgggggfcj");
        m.getsubstring("java program");
        m.gettoLowerCase("ALICE");
        m.gettoUpperCase("alice");
        m.gettrim("cl un y ");


    }
}

