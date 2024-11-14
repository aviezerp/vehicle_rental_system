abstract class Vehicle {

    private String licensePlate;
    private String make;
    private String model;
    protected double rentalPrice;

    // Constructor for the abstract class
    public Vehicle(String licensePlate, String make, String model, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    String getLicensePlate() {
        return licensePlate;
    }

    String getMake() {
        return make;
    }

    String getModel() {
        return model;
    }

    double getRentalPrice() {
        return rentalPrice;
    }

    abstract double calculateRentalCost(int days);
}
