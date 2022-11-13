package ObjectOrientedProgramming;

public class ThisKeyword {

    //Fields of the class
    int a;
    String s;

    int x=10;

    public ThisKeyword(int a, String s){

        //This keyword points to the class level variables.
        this.a=a;
        this.s=s;

    }


    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(1000, "Java");

        System.out.println(obj.a);
        System.out.println(obj.s);


    }


}
