package sample;

public class Car {

    private int speed;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car() {

    }

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public void stepOnAccele() {
        speed = speed + 10;
        System.out.println("スピードが" + speed + "km/h増えました");
    }

    public void stepOnBrake() {
        speed = speed - 10;
        System.err.println("スピードが" + speed + "km/h減りました");
    }
}
