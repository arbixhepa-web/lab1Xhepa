/**
 * Project: Lab 1
 * Purpose Details: Motorcycle Class
 * Course: IST 242
 * Author: Arbi Xhepa
 * Date Developed:
 * Last Date Changed:
 * Revision:
 */

public class Motorcycle {

    // Fields
    private String brand;
    private String model;
    private int year;
    private double engineSize;
    private MotorcycleType type;
    private FuelType fuelType;
    private Engine engine;

    // Constructor
    public Motorcycle(String brand, String model, int year,
                      double engineSize, MotorcycleType type,
                      FuelType fuelType, Engine engine) {

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineSize = engineSize;
        this.type = type;
        this.fuelType = fuelType;
        this.engine = engine;
    }

    // Getters and Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public MotorcycleType getType() {
        return type;
    }

    public void setType(MotorcycleType type) {
        this.type = type;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}