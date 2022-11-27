package java_intermediate.exception_handling;

import java.util.Scanner;

public class LearnExceptionHandling {

    public static void main(String[] args) {

   /*     try {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter a value");
            int x = s.nextInt();
            System.out.println("Enter another value");
            int y = s.nextInt();

            System.out.println(x / y);

        }catch (ArithmeticException e) {

            System.out.println("Can not divide it by zero");

        }*/

        //Example with multiple try and catch

        int[] iA = null;

        try {
            System.out.println(iA[20]);

        } catch (NullPointerException n) {

            System.out.println("Your array has null value");

        } catch (ArrayIndexOutOfBoundsException a) {

            System.out.println("your array is out of bound");

        } catch (Exception e) {

            e.getMessage();

        }


    }
}
