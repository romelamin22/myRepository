package FirstPackage;

import java.util.Scanner;

public class ScannerInputTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Add an INT value: ");
        int x = sc.nextInt();
        System.out.println("Add another INT value: ");
        int y = sc.nextInt();

        System.out.println(x+y);

        sc.close();



    }

}
