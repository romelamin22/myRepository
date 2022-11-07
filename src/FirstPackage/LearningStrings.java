package FirstPackage;

public class LearningStrings {

    public static void main(String[] args) {

        String s = "HeLLo";

        //to know the length
        System.out.println(s.length());//counts the length of the string

        //to concat
        System.out.println(s + " my name is Java");//Concat or Concatenation

        //another way of concat
        String s2 = "What's up";

        System.out.println(s.concat(s2));

        //trim()
        System.out.println(s2.trim());

        //toLowercase()
        System.out.println(s.toLowerCase());

        //toUpperCase()
        System.out.println(s.toUpperCase());

        //Substring - Returns a part of the string
        System.out.println(s.substring(2));

        System.out.println(s2.substring(7));//up

        //Substring with begin and end index
        System.out.println(s2.substring(2,4));

        //equal()
        String s3 = "Name";
        String s4 = "name";

        System.out.println(s3.equals(s4));//equals is same ==



    }

}
