package review;

//as soon as we implement an interface we have to also implement its methods
public class MainClassTwo implements MyInterfaceTwo{
    @Override
    public void myM() {
        System.out.println(1);
    }

    @Override
    public void myM2() {
        System.out.println(2);
    }

    @Override
    public void myM3() {
        System.out.println(3);
    }

    @Override
    public void myM4() {
        System.out.println(4);
    }

    public static void main(String[] args) {

        MainClassTwo obj = new MainClassTwo();


    }

}
