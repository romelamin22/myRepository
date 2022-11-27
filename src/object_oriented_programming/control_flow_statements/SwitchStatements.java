package object_oriented_programming.control_flow_statements;

public class SwitchStatements {

    public static void main(String[] args) {

        int dayOfWeek = 5;

        switch(dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Can not find the day");

        }

    }
}
