package brain_teaser;

import java.util.Scanner;

public class FindTheSmallestNumber {

    public static void main(String[] args) {
        //Take inputs from users for two variables and print the largest variable

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int a = sc.nextInt();
        System.out.println("Please enter another number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("The first number is bigger");
        } else if (b > a) {
            System.out.println("The 2nd number is bigger");
        } else {
            System.out.println("These numbers equal");
        }

        sc.close();


    }

}
