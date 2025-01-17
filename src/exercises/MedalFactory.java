package exercises;

public class MedalFactory {

    private Employee[] employee;

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public Medal[] makeMedal(Material[] mat) {

        Material[] materials = new Material[4];

        int totalSalaly = 0;

        for (int i = 0; i < mat.length; i++) {
            Employee employees = new Employee();
            totalSalaly = totalSalaly + employees.getSalary();
        }

        Medal[] medals = new Medal[3];

        for (int i = 0; i < materials.length; i++) {
            if (mat[i].getName() == "金") {
                medals[i].setName("金メダル");
            } else if (mat[i].getName() == "銀") {
                medals[i].setName("銀メダル");
            } else if (mat[i].getName() == "銅") {
                medals[i].setName("銅メダル");
            } else {
                medals[i].setName("不良メダル");
                mat[i].setCost(0);
            }

            medals[i].setPrice(mat[i].getCost() + (totalSalaly / 2));

            medals[i].setName(mat[i].getName());
        }

        return medals;
    }

}
