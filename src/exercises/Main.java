package exercises;

public class Main {

    public static void main(String[] args) {
        
        Employee[] emp = new Employee[3]; 

        emp[0] = new Employee();
        emp[0].setName("山田");
        emp[0].setSalary(200000);

        emp[1] = new Employee();
        emp[1].setName("海田");
        emp[1].setSalary(220000);

        emp[2] = new Employee();
        emp[2].setName("川田");
        emp[2].setSalary(240000);

        Material[] mat = new Material[4];

        mat[0] = new Material();
        mat[0].setName("金");
        mat[0].setCost(10000);

        mat[1] = new Material();
        mat[1].setName("銀");
        mat[1].setCost(5000);

        mat[2] = new Material();
        mat[2].setName("銅");
        mat[2].setCost(1000);

        mat[3] = new Material();
        mat[3].setName("木");
        mat[3].setCost(500);

        MedalFactory medalFactory = new MedalFactory(emp);

        Medal[] medalInfo = medalFactory.makeMedal(mat);

        for(int i=0;i<medalInfo.length;i++){
        System.out.println("製品名：" + medalInfo[i].getName() + "メダル　/　価格：" + medalInfo[i].getPrice(null));
        }

    }
}
