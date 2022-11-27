package java_intermediate.data_structure;

import java.util.Stack;

public class LearnStack {

    //gets added on top
    //last in first out(LIFO)

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();


        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        myStack.pop();

       /* for (int a: myStack){

            System.out.println(a);
        }*/
        //System.out.println(myStack.peek());//peeks into the top element

        System.out.println(myStack.search(50));


    }

}
