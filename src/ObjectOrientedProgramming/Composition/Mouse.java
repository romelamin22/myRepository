package ObjectOrientedProgramming.Composition;

public class Mouse {

    String brand;
    String color;
    boolean isWireless;
    boolean hasScrollWheel;

    public Mouse(String brand, String color, boolean isWireless, boolean hasScrollWheel){

        this.brand = brand;
        this.color = color;
        this.isWireless = isWireless;
        this.hasScrollWheel = hasScrollWheel;

    }

    void leftClick(){

        System.out.println("Left Button Click");

    }

    void rightClick(){

        System.out.println("Right Button Click");

    }

    void scrollUp(){

        System.out.println("Scrolling Up");

    }

    void  scrollDown(){

        System.out.println("Scrolling Down");

    }


}
