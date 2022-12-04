package java_intermediate.data_structure;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {

        //First in first out
        Queue<Integer> q = new LinkedList<>();

        q.add(10);//adding
        q.add(20);
        q.add(30);

        q.poll();//removes 10



        //System.out.println(q);

        System.out.println(q.peek());//peek is used to see the first value of queue list
//        System.out.println(q.size());//3
//        System.out.println(q.contains(20));
//        System.out.println(q.toArray()[2]);
//        System.out.println(q.poll());



    }


}
