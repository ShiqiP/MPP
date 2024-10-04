package Lab3.prob2;

import java.util.List;

public class Landlord {
    private List<Building> buildings;


    public Landlord(List<Building> buildings) {
        this.buildings = buildings;
    }

    public double calculateProfit() {
        double profit = 0;
        for (Building building : buildings) {
            profit += building.calculateProfit();
        }
        return profit;
    }

}
