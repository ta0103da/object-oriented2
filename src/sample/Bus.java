package sample;

public class Bus extends Car{

    public int price;

    @Override
    public void stepOnAccele(){
        // speed += 10;
        // System.out.println("スピードは" + speed + "km/hです");

        super.stepOnAccele();

        price += 30;
        System.out.println("料金は" + price + "円です");
    }
}
