package homework09.race;

import java.util.ArrayList;
import java.util.List;

public class Race {
    int raceLength = 1000; //длина гонки
    String raceRoute; //маршрут гонки
    int thePrizeFund = 50000;//призовой фонд

    // участники - коллекция автомобилей

    ArrayList<String> cars = new ArrayList<String>() {{
            add("porsheCar");
            add("lamborghiniCar");
            add("fordCar");
            add("ferrariCar");

        }};
}
