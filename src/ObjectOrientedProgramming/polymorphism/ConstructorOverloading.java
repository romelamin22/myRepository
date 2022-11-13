package ObjectOrientedProgramming.polymorphism;

public class ConstructorOverloading {

    int one;
    double two;
    String three;

    public ConstructorOverloading(int one){

        this.one=one;

    }

    public ConstructorOverloading(int one, double two, String three){

        this.one=one;
        this.two=two;
        this.three=three;

        System.out.println(three);


    }

    public static void main(String[] args) {

        ConstructorOverloading obj = new ConstructorOverloading(50);

        System.out.println(obj.one);



    }
}
