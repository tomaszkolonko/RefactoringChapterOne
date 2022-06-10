import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        String result = "Rental Record for " + name + "\n";

        for (Rental rental : rentals) {
            // shows figures for this rental
            result += "\t" + rental.createTitle() + "\n";
        }

        // add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        final int totalFrequenterPoints = FrequenterPoints.total(rentals.stream().map(Rental::frequentRenterPoints));
        result += "You earned %d frequent renter points".formatted(totalFrequenterPoints);
        return result;
    }

    private double getTotalAmount() {
        double amountToPay = 0.0;
        for (Rental rental : rentals) {
            amountToPay += rental.getAmountToPay();
        }
        return amountToPay;
    }

}
