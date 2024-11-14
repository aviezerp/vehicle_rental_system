public class Car extends Vehicle {
    private String type;

    // constructor
    public Car(String licensePlate, String make, String model, double rentalPrice, String type) {
        super(licensePlate, make, model, rentalPrice); // Set attributes of Vehicle
        this.type = type;
    }

    public String getType() {
        return type;
    }

    double calculateRentalCost(int days) {
        return super.getRentalPrice() * days;
    }
}
