package object_oriented_programming.control_flow_statements;

public class ForEachLoop {

    public static void main(String[] args) {

        //A variable can only hold one assigned value at a time

      /*  int x = 10;
        x = 20;
        x = 30;
        x = 40;
        x = 50;
        x = 30;
        System.out.println(x);*/

        //Array

        int[] a ={10,20,30,40,50,60,70,80};

        //For each loop is used when you don't know how many times you want the loop to continue.

        for (int e:a){

            System.out.println(e);

        }

    }

}
