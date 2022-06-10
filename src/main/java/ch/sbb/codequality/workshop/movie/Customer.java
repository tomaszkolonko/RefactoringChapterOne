package ch.sbb.codequality.workshop.movie;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

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
        result += "Amount owed is " + Rental.calculateTotalAmount(rentals) + "\n";
        result += "You earned %d frequent renter points".formatted(Rental.calculateFrequenterPoints(rentals));
        return result;
    }

}
