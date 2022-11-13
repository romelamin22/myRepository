package FirstPackage;

public class ConstructorOfClass {

    int x=200;
    String str="Name";

    public ConstructorOfClass(int x2, String str2){

        x=x2;
        str=str2;

    }

    void mOne(){
        System.out.println("My name is Romel");
    }

    public static void main(String[] args) {

        ConstructorOfClass obj = new ConstructorOfClass(10, "Hello");

        System.out.println(obj.x);
        System.out.println(obj.str);


    }

}
