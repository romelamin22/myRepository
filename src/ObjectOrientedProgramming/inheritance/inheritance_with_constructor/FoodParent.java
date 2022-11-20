package ObjectOrientedProgramming.inheritance.inheritance_with_constructor;

public class FoodParent {

    //foods
    int size;
    String nameOfFood;

    public FoodParent(int size, String nameOfFood){

        this.size = size;
        this.nameOfFood = nameOfFood;

    }

    void eatFood(){
        System.out.println("Out of all the food in the world what are you eating now?");
    }

}
