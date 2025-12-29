public class Main {
   public static void main(String[] args) {
        Driver driver1 = new Driver("Nurzhan", "A212323");
        Driver driver2 = new Driver("Arystan", "C243434");

        Car car1 = new Car("Range Rover", 2024, 4, "Gasoline");
        Motorcycle motorcycle1 = new Motorcycle("Suzuki", 2019, true);
        Truck truck1 = new Truck("Freightuner", 2015, 14, 2 );

       car1.setDriver(driver2);
       motorcycle1.setDriver(driver1);
       truck1.setDriver(driver1);

       Vehicle[] vehicles = {car1, motorcycle1, truck1};
       for(int i = 0; i < vehicles.length; i++) {
           Vehicle v = vehicles[i];
           v.startEngine();
           v.displayInfo();
           v.stopEngine();
           System.out.println("Driver Info: ");
           if(v.getDriver() != null) {
               v.getDriver().displayDriverInfo();
           }
           System.out.println("_____________________________");
       }


    }
}
