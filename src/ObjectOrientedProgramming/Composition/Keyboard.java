package ObjectOrientedProgramming.Composition;

public class Keyboard {

    String brand;
    boolean isWireless;
    boolean hasNumpad;

    public Keyboard(String brand, boolean isWireless, boolean hasNumpad){

        this.brand = brand;
        this.isWireless = isWireless;
        this.hasNumpad = hasNumpad;

    }

    void typingWithKeyboard(){

        System.out.println("Started typing with my new keyboard");

    }

    void turnOnCapsLock(){

        System.out.println("Caps Lock turned on, we're typing in all CAPITAL");

    }

    void turnOffCapsLock(){

        System.out.println("Caps Lock turned off, we're typing in all lowercase");

    }

}
