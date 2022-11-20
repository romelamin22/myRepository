package ObjectOrientedProgramming.inheritance.inheritance_with_constructor;

public class TunaFoodChild extends FoodParent{

    boolean isItFrozen;
    int weight;

    public TunaFoodChild(boolean isItFrozen, int weight, int size, String nameOfFood){

        super(size, nameOfFood);
        this.isItFrozen = isItFrozen;
        this.weight = weight;

    }

    void eatingMyTuna(){
        super.eatFood();
        System.out.println("Eating tuna");

    }

}
