import opentutorials.org.iot.Elevator;
import opentutorials.org.iot.Lighting;
import opentutorials.org.iot.Security;

public class OkJavaGoinHome {
    public static void main(String[] args){

        String id = "JAVA APT 507";

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id+ " // Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+" // Floor Lamp");
        floorLamp.on();

    }

}
