package FirstPackage;

public class OperatorsClass {

    public static void main(String[] args) {
        // + or addition

        System.out.println(4+5);

        // - or subtraction

        System.out.println(6-1);

        //* or Multiplication

        System.out.println(5*4);

        //Division or /

        System.out.println(5/4);

        //Modulus operator

        System.out.println(100%21);

        //Assignment Operators
        // = operator
        int x=10; //Assigning 10 into x
        x=20; //Once we initialize a variable with its data type we don't need to provide the
                //data type anymore
        x=30;
        x=40; // most recent one will be called

        System.out.println(x);

        //Incremental +=

        int y=5;

        y +=4; // y=y+4 same as this line;

        System.out.println(y);


        //Decrement -=

        int z= 10;

        z -=6;

        System.out.println(z);

        //Multiplication *=

        z *=5;

        System.out.println(z);

        //Division /=

        z /=4;

        System.out.println(z);

        //Modulus %=

        z %=2;

        System.out.println(z);

        //Comparison operator
        // Equal to '=='

        int c=200;
        int d=100;

        System.out.println(c==d);

        //Not Equal to !=
            //! not

        System.out.println(c!=d);

        //Greater than > (exclusive)

        System.out.println(6>6);

        //Greater than or equal to >= (inclusive)

        System.out.println(6>=6);

        //Less than <

        System.out.println(4<4);

        //Less than or equal to <=

        System.out.println(4<=4);

        //Logical operator
        //And '&&'

        System.out.println(40>50 && 100<200);

        //Or '||'

        int currentYear=2022;
        int nextYear=2023;

            //true             //false
        if (currentYear<nextYear || currentYear>nextYear){
            System.out.println("You guys are awesome");
        }

        //'!' not operator

        boolean u = 5>10;

        System.out.println(!u); //the value of u should be false




    }
}
