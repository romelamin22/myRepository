package FirstPackage;

public class ConstructorAndInst {

    //A constructor in Java is a special method that is used to initialize objects.
    //Every time an object is created using the new() keyword, constructor is called.

    ConstructorAndInst(){

    }

    String str;
    int i;

    public static void main(String[] args) {

        ConstructorAndInst obj = new ConstructorAndInst();

        obj.str = "Hello";

        //Another way of creating new object
        new ConstructorAndInst().str = "Hello";
        new ConstructorAndInst().str = "Hi";

    }

}
