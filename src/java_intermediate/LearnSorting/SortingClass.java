package java_intermediate.LearnSorting;

public class SortingClass {

    public static void main(String[] args) {

        int[] notsorted = {69,75,14};

        for (int a = 0; a < notsorted.length; a++){

            for (int b = a+1; b < notsorted.length; b++){ // b will compare one number

                int tmp;

                if (notsorted[b]< notsorted[a]){

                    tmp = notsorted[a];

                    notsorted[a] = notsorted[b];

                    notsorted[b] = tmp;

                }

            }
            System.out.println(notsorted[a]);
        }

    }

}
