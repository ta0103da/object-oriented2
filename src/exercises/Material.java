package exercises;

public class Material {

    private String name;
    private int cost;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
	public String toString() {
		return "Material [name=" + name + ", cost=" + cost + "]";
	}

}
