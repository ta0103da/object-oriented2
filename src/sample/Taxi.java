package sample;

public class Taxi extends Car{

    public int price;

    public void payment(){
        System.out.println("料金を" + price + "円払いました");
        price = 0;
    }

    @Override
    public void stepOnAccele(){
        // speed = speed +10;
        // System.out.println("スピードが" + speed + "km/h増えました");
        super.stepOnAccele(); // 上記2行と同じ意味super.xxx();

        price = price + 90;
        System.out.println("料金が" + price + "円に増えました");
    }

}
