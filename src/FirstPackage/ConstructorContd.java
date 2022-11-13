package FirstPackage;

public class ConstructorContd {

    //Constructor
    public ConstructorContd(){

        System.out.println("Call the Constructor");

    }

    //Method
    void mOne(){

        System.out.println("hello");
    }

    public static void main(String[] args) {

        ConstructorContd obj = new ConstructorContd();

        obj.mOne();



    }

}
