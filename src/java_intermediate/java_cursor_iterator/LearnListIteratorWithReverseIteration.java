package java_intermediate.java_cursor_iterator;

import java.util.*;

public class LearnListIteratorWithReverseIteration {

    public static void main(String[] args) {

        //Example of list iterator
        //With list iterator we could iterate in both direction

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);

        //Iterator abc = al.iterator();//iterator could be used to iterate in one direction

        ListIterator li = al.listIterator();//list iterator can be used to iterate through in both direction

        System.out.println("---Prints Forward (top to bottom)---");

        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("---Print backward (bottom to top)---");

        while (li.hasPrevious()){
            System.out.println(li.previous());
        }

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "NY");
        hm.put(2, "TX");
        hm.put(3, "MN");

        //Iterator<HashMap.Entry<Integer, String>> itr = hm.entrySet().iterator();
        Iterator itr = hm.entrySet().iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

    }

}
