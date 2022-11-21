package ObjectOrientedProgramming.abstraction;

public abstract class AbstractClass {

    //Concrete Method
    void methodOne(){
        System.out.println("Hello");
    }

    //abstract method
    abstract void methodTwo();
    //if we have an abstract method in a class we MUST declare that class as an abstract class


    abstract void userNPass();
}
