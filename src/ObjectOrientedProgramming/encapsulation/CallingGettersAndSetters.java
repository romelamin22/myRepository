package ObjectOrientedProgramming.encapsulation;

public class CallingGettersAndSetters {

    public static void main(String[] args) {

        GettersAndSetters obj=new GettersAndSetters();

        obj.setSsn(546546546);
        System.out.println(obj.getSsn());
        obj.setAcc(77987888);
        System.out.println(obj.getAcc());

    }
}
