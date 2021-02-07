package carComparator;

import java.util.Comparator;

public class CarComparator2 implements Comparator<Car> {
    @Override
    public int compare(Car leftCar, Car rightCar) {
        if (leftCar.getVolume() == 0) {
            return 1;
        } else return Double.compare(leftCar.getVolume(), rightCar.getVolume());
    }
}
