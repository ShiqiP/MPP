package Lab3.prob2;

import java.util.List;

public class Building {
    private List<Apartment> apartments;
    private double maintanaceCost;

    public Building(double maintanaceCost, List<Apartment> apartments) {
        this.maintanaceCost = maintanaceCost;
        this.apartments = apartments;
    }

    public double calculateProfit() {
        double profit = 0;
        for (Apartment apartment : apartments) {
            profit +=apartment.getRent();
        }
        profit = profit-maintanaceCost;
        return profit;
    }

}
