import java.util.List;

public interface Customer {

    public String getName(); // returns the name of the customer

    public double rentVehicle(Vehicle vehicle, int days); // processes the rental of a vehicle for
    // a given number of days

    public List<Vehicle> getRentedVehicles(); // returns a list of vehicles rented by the customer

}
