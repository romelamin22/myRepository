package java_intermediate.exception_handling.learning_to_read_and_write;

import java.io.File;
import java.util.Scanner;

public class TextFileRead {

    public static void main(String[] args) throws Exception{

        //System.out.println("Hello! Everyone, how are you doing today?\nThe weather in NYC is bit chilli.");
        //System.out.println("The current weather is \"60F\"");//escape - the next character will be treated as a regular character
        //System.out.println("Exception handling \n\t1.");
        //System.out.println("I want do delete the last characters\b");


/*        File fl = new File("C:/myFolder/myText.txt");
        Scanner s = new Scanner(fl);

        while(s.hasNextLine()) {

            System.out.println(s.nextLine());

        }*/

        System.out.println(System.getProperty("user.dir")+"\\src\\files\\myFile.txt");

        String absolutePath = System.getProperty("user.dir");
        String relativePath = "\\src\\files\\myFile.txt";

        File myFile = new File(absolutePath+relativePath);

        Scanner sc = new Scanner(myFile);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
