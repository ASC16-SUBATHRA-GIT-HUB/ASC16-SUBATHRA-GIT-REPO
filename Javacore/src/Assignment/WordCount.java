package Assignment;

public class WordCount {
    static int countWords(String s)
    {
        String[] parts=s.trim().split("\\s+");
        int c=0;
        for(String p:parts)
            if(!p.matches("\\d+")) c++;
        return c;
        }
        public static void main(String[] args)
        {
            String input="sum of 12 and 20 is 32";
            System.out.println("word count(excluding numbers):" +countWords(input));
    }
}
