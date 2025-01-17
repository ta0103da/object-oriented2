package sample;

public class InstantiateTaxi {

    public static void main(String[] args) {
        

    Taxi taxi = new Taxi();
    
    taxi.setSpeed(0);
    taxi.setName("タクシー仕様のプリウス");

    taxi.stepOnAccele();
    taxi.stepOnAccele();
    taxi.stepOnBrake();

    System.out.println("現在の速度は" + taxi.getSpeed() + "km/hです。");

    }    

}
