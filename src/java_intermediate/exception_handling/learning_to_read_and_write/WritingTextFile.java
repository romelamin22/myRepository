package java_intermediate.exception_handling.learning_to_read_and_write;

import java.io.FileWriter;
import java.io.IOException;

public class WritingTextFile {

    //IO = Input and Output
    public static void main(String[] args) throws IOException {


            FileWriter fileWriter = new FileWriter("C:\\myFolder\\abc.txt");

            fileWriter.write("Hello! Everyone, This is written by a machine!");

            fileWriter.close();


    }
}
