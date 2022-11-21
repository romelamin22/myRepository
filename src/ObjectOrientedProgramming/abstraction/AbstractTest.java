package ObjectOrientedProgramming.abstraction;

//concrete class
//we're calling an abstract class from a concrete class
//we have to implement abstract methods
public class AbstractTest extends AbstractClass{

    @Override
    void methodTwo() {

        System.out.println("Hello");

    }

    @Override
    void userNPass() {

        System.out.println("Print my user n pass");

    }
}
