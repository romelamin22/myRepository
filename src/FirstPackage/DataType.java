package FirstPackage;

public class DataType {

    public static void main(String[] args) {
        //Primitive data type: it specifies the size and type of variable values.
        //Byte - 1 byte - Store whole numbers from -128 to 127
        byte k=100;
        System.out.println(k);

        //Short - 2 bytes - Stores whole number from -32,768 to 32,767
        short q=2000;
        System.out.println(q);

        //Int - 4 bytes - Stores whole number from -2,147,483,648 to 2,147,483,647
        int a=50000000;
        System.out.println(a);

        //Long - 8 bytes - Stores whole number from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //we need to add l at the end of the long data type variable.
        long b=45665454564655465l;

        System.out.println(b);

        //Primitive - Numeric - Floating Point data type
        //If we want to use decimal points we have to use floating point data type

        //float	- 4 bytes - Sufficient for storing 6 to 7 decimal digits with round up number.
        float f=10.1333467f;

        System.out.println(f);

        //double - 8 bytes - Sufficient for storing 15 to 16 decimal digits
        double d=1.1234565789101112;

        System.out.println(d);

        //Primitive - non-numeric data type
        //char - 2 bytes -  Stores a single character/letter or ASCII values
        char c='A';

        System.out.println(c);

        //boolean
        //default value of a boolean is false
        boolean bln=true;
        System.out.println(200>100);



    }
}
