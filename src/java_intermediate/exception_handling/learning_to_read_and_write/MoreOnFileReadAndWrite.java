package java_intermediate.exception_handling.learning_to_read_and_write;

import java.io.*;

public class MoreOnFileReadAndWrite {

    public static void main(String[] args) {

        //FileInputStream - it is used to read data from a file in the form of sequence of bytes
        //String path = "C:/myFolder/nothing.txt";
        //File myFile = new File(path);

        try {
            FileInputStream fis = new FileInputStream("C:/myFolder/nothing.txt");

            InputStreamReader isr = new InputStreamReader(fis);

            BufferedReader br = new BufferedReader(isr);

            String myRead;

            while ((myRead = br.readLine()) != null) {
                System.out.println(myRead);
            }
        }catch (FileNotFoundException f){

            System.out.println("File Not Found");

        }catch (IOException i){

            System.out.println("can not read from the file");
        }

    }

}
