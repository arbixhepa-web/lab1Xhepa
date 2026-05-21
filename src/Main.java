/**
 * Project: Lab 1
 * Purpose Details: Main Class
 * Course: IST 242
 * Author: Arbi Xhepa
 */

public class Main {

    public static void main(String[] args) {

        Motorcycle bike1 = new Motorcycle(
                "Yamaha",
                "R1",
                2024,
                998,
                MotorcycleType.SPORT,
                FuelType.GASOLINE,
                new Engine(200, 4)
        );

        Motorcycle bike2 = new Motorcycle(
                "Harley-Davidson",
                "Street Glide",
                2023,
                1868,
                MotorcycleType.CRUISER,
                FuelType.GASOLINE,
                new Engine(95, 2)
        );

        Motorcycle bike3 = new Motorcycle(
                "Honda",
                "Africa Twin",
                2025,
                1084,
                MotorcycleType.TOURING,
                FuelType.GASOLINE,
                new Engine(101, 2)
        );

        printMotorcycle(bike1);
        printMotorcycle(bike2);
        printMotorcycle(bike3);
    }

    public static void printMotorcycle(Motorcycle bike) {

        System.out.println("Brand: " + bike.getBrand());
        System.out.println("Model: " + bike.getModel());
        System.out.println("Year: " + bike.getYear());
        System.out.println("Engine Size: " + bike.getEngineSize() + "cc");
        System.out.println("Type: " + bike.getType());
        System.out.println("Fuel Type: " + bike.getFuelType());
        System.out.println("Horsepower: " + bike.getEngine().getHorsepower());
        System.out.println("Cylinders: " + bike.getEngine().getCylinders());

        System.out.println("--------------------------------");
    }
}
