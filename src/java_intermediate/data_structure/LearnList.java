package java_intermediate.data_structure;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

    public static void main(String[] args) {

        ArrayList<String> shoppingList= new ArrayList<>();

        shoppingList.add(0, "Milk");
        shoppingList.add(1,"Eggs");
        shoppingList.add(2, "Bread");

        System.out.println(shoppingList.size());
        System.out.println(shoppingList.contains("Milk"));
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.indexOf("Bread"));

        shoppingList.remove("Eggs");
        shoppingList.remove(1);

        for (String a: shoppingList){

            System.out.println(a);

        }

    }
}
