package ObjectOrientedProgramming.enum_learn;

public class CallEnum {

    public static void main(String[] args) {

        TestEnum e = TestEnum.FRIDAY;

//        switch (e){
//
//            case SATURDAY:
//                System.out.println("we have class today");
//                break;
//            case THURSDAY:
//                System.out.println("we don't have class today");
//                break;
//        }

        for (TestEnum d: TestEnum.values()){

            System.out.println(d);

        }

    }


}
