package FirstPackage;

public class CastingLearn {

    public static void main(String[] args) {

        int i = 50;//smaller
        short s = 5;
        long l = 10L;
        float f = 5.5f;
        double d = 7.999;//bigger

        int convToInt = (int) (d);//(int) - type we want to convert it to, (d) we want to convert from
        double convToDouble = (double) (i);
        float conToFloat = (long) (f);

        System.out.println(convToInt); //narrowing

        System.out.println(convToDouble); //widening

        System.out.println(conToFloat); //narrowing

        int a =10;//smaller
        long b= 6546544L;//bigger 2147483647
        int c = (int) (b);

        System.out.println(c);//1016387450

        float j = 4.5f;
        double k = 5.21321321;

        System.out.println((float) (k));

        //Primitive to non-primitive
        //Concat
        String str = "Hello";
        String str2 = "This is Java";

        System.out.println(str + str2);

        String str3 = "5+5";

        System.out.println(str3);

        int int1 = 40;//"40"+5 = 45

        String convertToStr = String.valueOf(int1);

        System.out.println(5 + convertToStr);

        int additionInt = 100+100;//200

        //let's convert it to string

        String conToStr2 = String.valueOf(additionInt);//200 is a string at this point

        System.out.println(5+conToStr2);

        boolean bl = false;

        System.out.println(String.valueOf(bl)+"yes");

        char ch = 'H';

        System.out.println(String.valueOf(ch));

        //string to char
        String str4 = "hello";

        System.out.println(str4.charAt(4));

        //Non-primitive to primitive
        int io= 5; //int is a data type

        String myStr5 = "5";

        System.out.println(Integer.parseInt(myStr5)+5);


    }

}
