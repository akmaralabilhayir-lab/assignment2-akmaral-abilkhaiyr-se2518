public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand + " Year: " + year);
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
