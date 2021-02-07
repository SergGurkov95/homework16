package carComparator;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car leftCar, Car rightCar) {
        return leftCar.getYearOfManufacture() - rightCar.getYearOfManufacture();
    }
}
