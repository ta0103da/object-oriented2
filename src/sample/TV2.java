package sample;

public class TV2 implements Electrical{

    private boolean powerOn;

    private int channel;
    
    @Override
    public void power() {

        if(powerOn){
            System.out.println("テレビの電源が切れました");
            powerOn = false;
        }else{
            System.out.println("テレビの電源が入りました");
            powerOn = true;
        }
    }
    
    public void changeChannel(int channel) {
        if(!powerOn){
            System.out.println("テレビの電源を入れてください");
            return;
        }

        this.channel = channel;

        System.out.println(this.channel + "チャンネルに切り替わりました");
    }
}
