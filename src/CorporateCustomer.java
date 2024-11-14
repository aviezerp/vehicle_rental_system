import java.util.ArrayList;
import java.util.List;

public class CorporateCustomer implements Customer {

    private String companyName;

    public List<Vehicle> vehicles = new ArrayList<>();

    // constructor
    public CorporateCustomer(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return companyName;
    }

    public double rentVehicle(Vehicle vehicle, int days) {
        double tmp = 1;
        return tmp;
    }

    // Corporate customers get a discount on all rentals
    @Override
    public List<Vehicle> getRentedVehicles() {

        return vehicles;
    }

}
