package ObjectOrientedProgramming;

import java.io.InputStream;
import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

       /* //next() will only go until it sees a space
        String str = s.next();

        System.out.println(str);

        //Next line will go until the line ends
        String str2 = s.nextLine();

        System.out.println(str2);
*/
        System.out.println("Please enter an int Value: ");

        //nextInt will also go until a space
        int x = s.nextInt();

        System.out.println("Enter Another Number: ");

        int y = s.nextInt();

        System.out.println(x+y);


    }

}
