package exercises;

public class MedalFactory {

    private Employee[] employees;

    public MedalFactory(Employee[] employees) {
        this.employees = employees;
    }

    public Medal[] makeMedal(Material[] mat) {

        // Material[] materials = new Material[4];

        Medal[] medals = new Medal[mat.length];

        // int totalSalaly = 0;

        // for (int i = 0; i < mat.length; i++) {
        // Employee employees = new Employee();
        // totalSalaly = totalSalaly + employees.getSalary();
        // }

        // Medal[] medals = new Medal[3];

        for (int i = 0; i < mat.length; i++) {
            Medal medal = new Medal();

            Material material = mat[i];

            if (mat[i].getName() == "金") {
                medal.setName("金メダル");
                medal.setPrice(calcMedalPrice(material.getCost(), mat.length));
            } else if (mat[i].getName() == "銀") {
                medal.setName("銀メダル");
                medal.setPrice(calcMedalPrice(material.getCost(), mat.length));
            } else if (mat[i].getName() == "銅") {
                medal.setName("銅メダル");
                medal.setPrice(calcMedalPrice(material.getCost(), mat.length));
            } else {
                medal.setName("不良メダル");
                medal.setPrice(0);
            }

            medals[i] = medal;
        }

        return medals;
    }

    /*
     * メダルの価格を求める.
     * 
     * メダルの価格 = 材料のコスト + (従業員の給料の合計 / 製品数) * 1.5(←利益上乗せ分、端数切り捨て)
     */
    private int calcMedalPrice(int materialCost, int medalCount) {

        final double PROFIT = 1.2;

        // 従業員の給料の合計
        int totalSalary = getTotalSalary();

        // メダルの価格
        int medalPrice = (int) (materialCost + (totalSalary / medalCount) * PROFIT);

        return medalPrice;
    }

    /*
     * 従業員の給料の合計を求める.
     */
    private int getTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

}
