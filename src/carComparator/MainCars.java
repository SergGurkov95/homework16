package carComparator;

import java.util.*;

public class MainCars {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("toyota", "corolla", 2008, 2.4));
        cars.add(new Car("honda", "civic", 2006, 1.8));
        cars.add(new Car("volkswagen", "golf", 2014, 1.6));
        cars.add(new Car("honda", "accord", 1995, 2.7));
        cars.add(new Car("tesla", "model 3", 2016, 0));

        cars.sort(new CarComparator());

        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("\n");

        Set<Car> cars2 = new TreeSet<>(new CarComparator2());

        cars2.add(new Car("toyota", "corolla", 2008, 2.4));
        cars2.add(new Car("honda", "civic", 2006, 1.8));
        cars2.add(new Car("volkswagen", "golf", 2014, 1.6));
        cars2.add(new Car("honda", "accord", 1995, 2.7));
        cars2.add(new Car("tesla", "model 3", 2016, 0));


        for (Car car : cars2){
            System.out.println(car);
        }





    }
}
