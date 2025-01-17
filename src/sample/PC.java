package sample;

public class PC implements Electrical{

    private boolean PowerOn;

    public boolean isPowerOn() {
        return PowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        PowerOn = powerOn;
    }

    @Override
    public void power() {
        if(PowerOn){
            PowerOn=false;
            System.out.println("PCの電源が切れました");
        }else{
            System.out.println("設定を読み込んでいます");
            PowerOn=true;
            System.out.println("PCの電源が入りました");
        }
    }

}
