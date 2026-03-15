package Java.basics.Day03string;

public class StringMethod {
    public static void main(String[] args) {
        //String is immutable, all these methods create a new String 
        String name = "rohan";
        //getting len
        int len = name.length();
        System.out.println(len);
        //check string is empty or not
        //we isBlank() -> true if strinf contains only spaces
        System.out.println(name.isEmpty());
        //getting char at particular index
        char c = name.charAt(len-1);
        System.out.println(c);
        //comparing string content
        String name2 = "Rohan";
        System.out.println(name.equals(name2));//false
        System.out.println(name.equalsIgnoreCase(name2));//true: -> ignore upper & lower case

        String s1 = "remote";
        String s2 = "rar";

        System.out.println(s1.compareTo(s2)); //check ascii value of each char one by one
        // if same char in both string 
        // then check next until different find

        System.out.println(s1.compareToIgnoreCase(s2));
       
        String substr1 = name.substring(2);
        String substr2 = name.substring(2,4);

        System.out.println(name.toLowerCase()); //toUpperCase

        String a = "     hero";
        System.out.println(a.trim()); //remove extra space from start and end

        String b = "amar hero hero hero hero";
        String newb = b.replace("hero","zero"); //replace all the occurence of a word in string
        System.out.println(newb);
        //contains
        System.out.println(b.contains("h"));
        //startsWith & endsWith
        System.out.println(b.startsWith("am"));

        //indexOf
        System.out.println(b.indexOf("a",1));
        //convert int to string

        int i = 10;
        String s = String.valueOf(i);
        
        String formattedStr = String.format("My age is %d and name is %s",16,"cheetah");
        System.out.println(formattedStr);
    }
}
