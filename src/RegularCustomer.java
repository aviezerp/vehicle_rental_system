import java.util.ArrayList;
import java.util.List;

public class RegularCustomer implements Customer {

    private String name;

    public List<Vehicle> vehicles = new ArrayList<>();

    // constructor
    public RegularCustomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double rentVehicle(Vehicle vehicle, int days) {
        return vehicle.getRentalPrice() * days;
    }

    public List<Vehicle> getRentedVehicles() {

        return vehicles;
    }

}
