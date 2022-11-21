package ObjectOrientedProgramming.Composition;

public class Monitor {

    String brand;
    String resolution;
    int size;

    boolean hasWebCam;

    public Monitor(String brand, String resolution, int size){

        this.brand = brand;
        this.resolution = resolution;
        this.size = size;

    }

    public Monitor (String brand, String resolution, int size, boolean hasWebCam){

        this.brand = brand;
        this.resolution = resolution;
        this.size = size;
        this.hasWebCam = hasWebCam;

    }

    void turnOn(){

        System.out.println("Turning on monitor");

    }

    void turnOff(){

        System.out.println("Turning off monitor");

    }


}
