// This file is for repository of methods which are not in use now, but maybe later on.

public class App {

    public static void printCar(Car car, Customer customer) {
        System.out.println("Customer " + customer.getName() + " rented car c1 for 5 days");
        System.out.println("Vehicle details:");
        System.out.println("LicensePlate: " + car.getLicensePlate());
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Type: " + car.getType());
        System.out.println("Rental price per day for car c1 is: " + car.getRentalPrice() + " nis");
        System.out.println("Rental price for 5 days is: " + car.calculateRentalCost(5) + " nis\n");

    }

    public static void printTruck(Truck truck, Customer customer) {
        System.out.println("Customer " + customer.getName() + " rented truck t1 for 3 days");
        System.out.println("Vehicle details:");
        System.out.println("LicensePlate: " + truck.getLicensePlate());
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Capacity: " + truck.getCapacity());
        System.out.println("Rental price per day for truck t1 is: " +
                truck.getRentalPrice() + " nis");
        System.out.println("Rental price for 3 days is: " + truck.calculateRentalCost(3)
                + " nis\n");
    }

}
