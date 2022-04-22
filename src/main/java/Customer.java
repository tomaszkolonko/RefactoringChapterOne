import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return this.name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        for(Rental rental : rentals) {
            // shows figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getAmountToPay()) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";
        return result;


    }

    private int getFrequentRenterPoints() {
        int frequenterPoints = 0;
        for(Rental rental : rentals) {
            frequenterPoints += rental.getFrequentRenterPoints();
        }
        return frequenterPoints;
    }

    private double getTotalAmount() {
        double amountToPay = 0.0;
        for(Rental rental : rentals) {
            amountToPay += rental.getAmountToPay();
        }
        return amountToPay;
    }

}
