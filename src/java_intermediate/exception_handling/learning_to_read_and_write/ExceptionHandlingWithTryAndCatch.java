package java_intermediate.exception_handling.learning_to_read_and_write;

public class ExceptionHandlingWithTryAndCatch {

    public static void main(String[] args) {

        try {
            String[] arr = {"hi", "hello"};

            System.out.println(arr[3]);
        }catch (Exception e){

            System.out.println(e.getMessage());
        }

        int x;
    }



}
