package ObjectOrientedProgramming.polymorphism;

public class MethodOverloading {

    public int add(int one, int two){

        return one+two;

    }

    public int add(int one, int two, int three){

        return one+two+three;

    }

    public double add(int one, int two, double three){

        return one+two+three;

    }

    public int add(int one, int two, int three, String str){

        System.out.println(str);

        return one+two+three;
    }

    public double add(int one, double two, String str){

        System.out.println(str);
        return one+two;

    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
/*
        System.out.println(obj.add(10,20));

        System.out.println(obj.add(10,20,30));

        System.out.println(obj.add(40,20,30,"This method overloading"));*/

        System.out.println(obj.add(4,5.556, "Hello"));

/*      int x = 10;
        double y = 5.45;

        System.out.println(x+y);*/

    }


}
