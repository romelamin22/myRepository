package ObjectOrientedProgramming.inheritance.inheritance_with_constructor;

public class TestMain {

    public static void main(String[] args) {

        //When we are inheriting from the parent class to a child class,
        //as soon as we create an object for the child class we are also
        //creating an object for parent class
        TunaFoodChild myTuna = new TunaFoodChild(true, 5, 10, "Tuna");

        System.out.println(myTuna.isItFrozen);
        System.out.println(myTuna.weight);
        System.out.println(myTuna.size);
        System.out.println(myTuna.nameOfFood);

        myTuna.eatingMyTuna();



    }
}
