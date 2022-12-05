package java_intermediate.json;

import com.mysql.cj.xdevapi.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJson {

    public static void main(String[] args) {


        try {
            JsonParser jp = new JsonParser();
            FileReader fr = new FileReader("C:\\Users\\PNT\\IdeaProjects\\my_very_first_project\\src\\java_intermediate\\json\\test.json");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
