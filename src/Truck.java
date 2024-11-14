public class Truck extends Vehicle {
    private int capacity;

    // constructor
    public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
        super(licensePlate, make, model, rentalPrice); // Sets attributes of Vehicle.
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    double calculateRentalCost(int days) {
        return super.getRentalPrice() * days;
    }
}
