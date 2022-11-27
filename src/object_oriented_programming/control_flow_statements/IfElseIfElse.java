package object_oriented_programming.control_flow_statements;

public class IfElseIfElse {

    void ifElse(int x, int y){

        if (x>y){
            System.out.println("x is bigger");
        } else if (y>x) {
            System.out.println("y is bigger");
        } else if (x==y) {
            System.out.println("both have equal value");
        } else {
            System.out.println("something is wrong");
        }

    }

    int ifElseTwo(int a, int b){

        if (a>b){
            return a;
        } else if (b>a) {
            return b;
        } else if (a==b) {
            return -1;
        }

      return -1;

    }


    public static void main(String[] args) {

        IfElseIfElse obj = new IfElseIfElse();

        obj.ifElse(500,500);

        System.out.println(obj.ifElseTwo(200,200));

    }
}
