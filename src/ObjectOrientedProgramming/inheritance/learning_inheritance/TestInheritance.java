package ObjectOrientedProgramming.inheritance.learning_inheritance;

public class TestInheritance {

    public static void main(String[] args) {

        //int x = 10;

        //type //reference //instance
        Bread br = new Bread();
        Apples a = new Apples();

        //With this we can access only food class
        Food f = new Food();

        //Data type determines what we can access.
        Food s = new Salmon();

        //because the instance new Food() doesn't have any knowledge of Salmon data type
        //Salmon s2 = new Food();


        //We're buying a new bread
        //These are coming parent class
        br.name = "Wonder";
        br.size = 12;
        br.weight = 500;

        //This is coming from child class
        br.madeBy = "HomeMade";

        //we're buying apples from store
        //These are coming parent class
        a.name = "Red Apples";
        a.size = 4;
        a.weight = 1000;

        //This is coming from child class
        a.isRed = true;
        a.drinkingJuiceOfApple();







    }

}
