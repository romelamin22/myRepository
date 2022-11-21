package ObjectOrientedProgramming.abstraction.examples;

public class BuyingLaptop {

    public static void main(String[] args) {

        DellLaptop dl = new DellLaptop();

        dl.turnOn();
        dl.os();
        dl.webCam();
        dl.builtInKeyboard();
        dl.builtInMousePad();
        dl.turnOff();
    }

}
