package ObjectOrientedProgramming.Composition;

public class CompositionLearning {

    public static void main(String[] args) {

        Keyboard logitech = new Keyboard("logitech",true,true);
        Mouse appleMouse = new Mouse("Apple", "Silver", true, false);

        //Computer newPC = new Computer(logitech,appleMouse);
    }


}
