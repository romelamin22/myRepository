package FirstPackage.learn_final_keyword;

public class FinalWithMethodTwo extends FinalWithMethod{

    @Override
    void mOne() {

        super.mOne();

        System.out.println("Second");
    }

    public static void main(String[] args) {
        FinalWithMethod obj = new FinalWithMethodTwo();

        obj.mOne();
    }

}
