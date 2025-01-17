package sample;

public class InstantiateTaxi3 {
    public static void main(String[] args) {
        
        System.out.println("車を走らせます");
        Car car = new Car();
        car.stepOnAccele();

        System.out.println("タクシーを走らせます");
        Taxi taxi = new Taxi();
        taxi.stepOnAccele();
    }

}
