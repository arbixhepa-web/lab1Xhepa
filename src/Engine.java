/**
 * Project: Lab 1
 * Purpose Details: Motorcycle Class
 * Course: IST 242
 * Author: Arbi Xhepa
 * Date Developed:
 * Last Date Changed:
 * Revision:
 */
public class Engine {

    private int horsepower;
    private int cylinders;

    public Engine(int horsepower, int cylinders) {
        this.horsepower = horsepower;
        this.cylinders = cylinders;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}