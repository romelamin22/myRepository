package FirstPackage;

public class LearnKeywordsAndMethods {

    //Public - Everyone can see it, access it and use it.
    public static void myMethod(){

        System.out.println("Hello Everyone");

    }

    //Protected can be accessed within the class and within the same package that you created in

    protected static void myProtected(){

        System.out.println("Hi! this is a protected method example");

    }

    //Private - Private methods can only be used within the class it was created in.

    private static void myPrivate(){

        System.out.println("Hi! this is a PRIVATE method example");

    }

    /*
    Default: declaring a method without any access modifier.
    It has the same characteristics of the protected access modifier.
    It can be only accessed within the same class and same package.
    */

    static void myDefault(){

        System.out.println("Hi! this is a DEFAULT method example");

    }

    //If we need to return something from a method we need provide the data type we want to return as

    public static int myVoidExample(){

        int x =5;
        int y =10;

       return x + y;

    }

    public static boolean mMethod2(){

        int x = 20;
        int y = 30;

        return x>y;

    }

    public static int mIntMethod(){

        int x = 100;
        int y = 200;

        return x+y;

    }

    public static void mIntMethod2(){

        int a = 200;
        int b = 100;

        System.out.println(a+b);
    }

    public static void main(String[] args) {

        int z=5+mIntMethod();

        System.out.println(z);

    }

    boolean myValidation(){

        int i = 500;
        int j = 600;

        return i>j;


    }



}
