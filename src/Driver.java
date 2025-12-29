public class Driver {
    private String name;
    private String lisenceNumber;

    public Driver(String name, String lisenceNumber) {
        this.name = name;
        this.lisenceNumber = lisenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLisenceNumber() {
        return lisenceNumber;
    }

    public void setLisenceNumber(String lisenceNumber) {
        this.lisenceNumber = lisenceNumber;
    }

    public void displayDriverInfo() {
        System.out.println("Name: " + name + "\n Lisence Number: " + lisenceNumber);
    }
}
