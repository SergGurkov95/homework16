package carComparator;

public class Car {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private double volume;

    public Car(String brand, String model, int yearOfManufacture, double volume) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "\n" +brand + " " + model + " " + yearOfManufacture + " " + volume;
    }
}
