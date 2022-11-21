package ObjectOrientedProgramming.abstraction.examples;

public class DellLaptop extends Laptop {

    @Override
    public void turnOn() {
        System.out.println("Turning on");
    }

    @Override
    public void turnOff() {

        System.out.println("Turning off");

    }

    @Override
    public void os() {

        System.out.println("It is windows 10");

    }

    @Override
    public void webCam() {

        System.out.println("It has a 4K webcam");

    }

    @Override
    public void builtInKeyboard() {

        System.out.println("It has a keyboard with numpad");

    }

    @Override
    public void builtInMousePad() {

        System.out.println("It has a mousepad");

    }
}
