package sample;

public class Ex01 {

    public static void main(String[] args) {
        
        Bus bus = new Bus();
        bus.setSpeed(10);
        bus.stepOnAccele();
        bus.stepOnBrake();
        bus.stepOnBrake();
    }
}
