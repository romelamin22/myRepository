package FirstPackage.learn_final_keyword;

public class FinalWithInstanceMain {

    public static void main(String[] args) {

        FinalKeywordWithInstance jaguar = new FinalKeywordWithInstance();
        FinalKeywordWithInstance rr = new FinalKeywordWithInstance();
        FinalKeywordWithInstance nissan = new FinalKeywordWithInstance();

        jaguar.color = "Red";
        jaguar.brand = "Jaguar";
        jaguar.numOfDoors = 2;

        System.out.println(jaguar.color);

        rr.color = "Blue";
        rr.brand = "Range Rover";
        rr.numOfDoors = 5;

        System.out.println(rr.color);


        nissan.color = "silver";
        nissan.brand = "Nissan";
        nissan.numOfDoors = 2;

        System.out.println(nissan.color);



    }

}
