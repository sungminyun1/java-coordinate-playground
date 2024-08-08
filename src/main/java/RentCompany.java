import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    private List<Car> cars = new ArrayList<>();

    public static RentCompany create(){
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport(){
        return String.join("\n", gatherReports());
    }

    private List<String> gatherReports(){
        return cars.stream()
                .map(Car::report)
                .collect(Collectors.toList());
    }
}
