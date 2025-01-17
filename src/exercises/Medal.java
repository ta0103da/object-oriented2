package exercises;

public class Medal extends MedalFactory{

    private String name;
    private int price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice(Employee emp) {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    

}
