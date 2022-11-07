package FirstPackage;

public class Phone {

    //This class is the blueprint of all the phone that ever existed/will exist
    String color;
    String brand;
    int size;
    int weight;

    static String typeOfPhone = "Smart Phone";


    void turnOn(){

        System.out.println("Turns on the phone");

    }

    void turnOff(){

        System.out.println("Turns off the phone");

    }

    void phoneCall(){

        System.out.println("Making a phone call");

    }

    void sendText(){

        System.out.println("Sending a text");

    }

    public static void main(String[] args) {


        //Every instances that i create for the Phone class there are separate copy of these
        // variables and methods

        Phone myPhone = new Phone();

        Phone myPhone2 = new Phone();

        //Phone One
        myPhone.brand = "Apple";

        System.out.println(myPhone.brand);

        //Static member of the class doesn't belong to any object/instances
        // rather it belongs to class itself. We could change the assigned value as we want
        // without calling any instances
        // to change assigned values of a non-static member of class we need to create instances
        // and by calling different instances we can change the values

        System.out.println(typeOfPhone);

        /*
        When should we declare static variables/methods vs when not to??
        Ans. Static members we create if we want the value to be static/non - changable
         */


    }

}
