package java_intermediate.java_cursor_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();

        states.add("NY");
        states.add("AZ");
        states.add("NJ");
        states.add("TX");

        Iterator xyz = states.iterator();

        while (xyz.hasNext()){ //hasNext is a method of iterator which will look inside the arraylist and see if there
                                // are more than one element, if there are it will go the next one by using next() method

            System.out.println(xyz.next());

        }



    }
}
