import java.util.ArrayList;
import java.util.List;

public class VehicleRental {
    public static void main(String[] args) {

        System.out.println("Hi!\n");

        Car c1 = new Car("1234567", "KIA", "ceed", 125, "passenger");
        Car c2 = new Car("8901234", "TOYOTA", "Auris", 130, "Hibrid");
        Car c3 = new Car("5678901", "MAZDA", "3", 135, "recentDezign");
        Car c4 = new Car("2345678", "MAZDA", "6", 140, "updated");

        Truck t1 = new Truck("5071367", "Toyota", "Sienna", 187.0, 50);

        RegularCustomer regularCustomer_1 = new RegularCustomer("Yosi");
        RegularCustomer regularCustomer_2 = new RegularCustomer("David");
        CorporateCustomer corporateCustomer_1 = new CorporateCustomer("Leascar");
        CorporateCustomer corporateCustomer_2 = new CorporateCustomer("Hovalot Ltd.");

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(c3);
        vehicles.add(t1);
        vehicles.add(c4);

        corporateCustomer_2.vehicles = vehicles; // set list vehicles into list of Customer

        // printCar(c1, regularCustomer_1);
        // printTruck(t1, regularCustomer_2);
        printVehicles(corporateCustomer_2); // prints the all the vehicles of a cusstomer

    }

    public static void printVehicles(CorporateCustomer corporateCustomer) {
        if (!corporateCustomer.vehicles.isEmpty()) {
            for (Vehicle vehicle : corporateCustomer.vehicles) {
                printVehicle(vehicle, corporateCustomer);
            }
        } else
            System.out.println("No rented vehicles for this customer");

    }

    // this method is for generic vehicle - Car or Truck
    public static void printVehicle(Vehicle vehicle, Customer customer) {

        if (vehicle instanceof Car) {
            System.out.println("Customer " + customer.getName() + " rented a car ");
            System.out.println("Vehicle details:");
            System.out.println("LicensePlate: " + vehicle.getLicensePlate());
            System.out.println("Make: " + vehicle.getMake());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Type: " + ((Car) vehicle).getType());
            System.out.println("Rental price per day for car c1 is: " + vehicle.getRentalPrice() + " nis");
            System.out.println("Rental price for 5 days is: " + vehicle.calculateRentalCost(5) + " nis\n");
        }

        if (vehicle instanceof Truck) {
            System.out.println("Customer " + customer.getName() + " rented a Truck");
            System.out.println("Vehicle details:");
            System.out.println("LicensePlate: " + vehicle.getLicensePlate());
            System.out.println("Make: " + vehicle.getMake());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Capacity: " + ((Truck) vehicle).getCapacity());
            System.out.println("Rental price per day for truck t1 is: " +
                    vehicle.getRentalPrice() + " nis");
            System.out.println("Rental price for 3 days is: " + vehicle.calculateRentalCost(3)
                    + " nis\n");
        }
    }
}
