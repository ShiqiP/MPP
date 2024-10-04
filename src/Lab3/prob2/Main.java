package Lab3.prob2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apartment[] a1 =
                {new Apartment(1000)
                        , new Apartment(2000)
                        , new Apartment(3000)};

        Apartment[] a2 =
                {new Apartment(500)
                        , new Apartment(700)
                        , new Apartment(800)};

        Apartment[] a3 =
                {new Apartment(400)
                        , new Apartment(750)
                        , new Apartment(650)};

        Building[] b1 = {
                new Building(100, Arrays.asList(a1)),
                new Building(200, Arrays.asList(a2)),
                new Building(300, Arrays.asList(a3)),

        };

        Landlord landlord = new Landlord(Arrays.asList(b1));
        System.out.println(landlord.calculateProfit());
    }

}
