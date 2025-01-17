package sample;

public class polymorphism2 {

    public static void main(String[] args) {

        Car car = null;

        car = new Taxi();
        car.stepOnAccele();
        car = new Bus();
        car.stepOnAccele();
    }
}
