import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
//Elevator라는 클래스를 불러오는 것이다.
import org.opentutorials.iot.Security;
import java.lang.String;

public class OkJavaGoInHomeInput {

    public static void main(String[] args) {

        String[] myArr = { "Java APT 404", "50" };

        OkJavaGoInHomeInput JavaInput = new OkJavaGoInHomeInput();
        JavaInput.go(myArr);
    }

    private void go(String[] args) {
        // args 파라미터 = 매개변수라고 한다.

        String id = args[0];
        // 입력 할떄까지 멈춰 있는다. 사용자의 입력값에 따라서 다르게 작동한다.

        String bright = args[1];

        // Elevator call
        Elevator myElevator = new Elevator(id); // 자바 아파트의 엘리베이터가 new~ 이다.
        // myElevator라는 변수는 반드시 Elevator라는 데이터 타입에 해당되는 데이터만 올 수 있다라는 뜻이다.
        // org.opentutorials.iot.Elevator 전부 적는 것도 가능
        myElevator.callForUp(1);
        // 1층으로 엘리베이터 보내라는 뜻. 엘리베이터 한테 명령한 것이다.

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / floorLamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();

        // https://opentutorials.org/module/4294/26661 수업 주소
    }

}
