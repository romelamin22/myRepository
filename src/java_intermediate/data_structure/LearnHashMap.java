package java_intermediate.data_structure;

import java.util.HashMap;

public class LearnHashMap {

    /*
    i) HashMap looks for the value through the key
    ii) Data is stored in key-value pairs
    iii) Can not have duplicate keys
    iv) Can have duplicate values
    * */

    public static void main(String[] args) {

        HashMap<Integer, String> mHash =  new HashMap<>();

        mHash.put(1, "Milk");
        mHash.put(2, "Eggs");
        mHash.put(3, "Sugar");
        mHash.put(4, "Milk");

       /* System.out.println(mHash.keySet());
        System.out.println(mHash.values());*/

    }

}
