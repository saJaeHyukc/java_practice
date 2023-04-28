import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class InputProgram {

    // paramter, 매개변수 (args)
    // String[] 문자열로만 이루어진 배열
    public static void main(String[] args){

        // 입력값 사용시 장점: 변수 값을 일일이 바꿔주지 않아됨
        // 입력값 형태: int, char, string, double
        // String id = JOptionPane.showInputDialog("Enter a Id");
        // String bright = JOptionPane.showInputDialog("Enter a Bright level");
        String id = args[0];
        String bright = args[1];

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

        DimmingLights moodLamp = new DimmingLights(id+" Mood Lamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();

    }
}
