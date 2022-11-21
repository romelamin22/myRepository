package ObjectOrientedProgramming.Composition;

public class BuyADesktopComputer {

    public static void main(String[] args) {

        Keyboard dellKeyboard = new Keyboard("Dell", true, true);
        Mouse hpMouse = new Mouse("HP","Blue", true, true);
        Monitor asusMonitor = new Monitor("Asus", "4K", 27);
        Monitor dellMonitor = new Monitor("Dell", "4K", 27, true);
        Monitor gamingMonitor = new Monitor("MSI","4K", 27);


        Computer computer = new Computer(dellKeyboard, hpMouse, asusMonitor);

        computer.monitor.turnOn();
        computer.keyboard.typingWithKeyboard();
        computer.mouse.leftClick();

    }

}
