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

    public RentalStatus rentalStatus() {
        String statementHeader = "Rental record for " + name;
        return new RentalStatus(
            statementHeader,
            rentals,
            Rental.calculateFrequenterPoints(rentals),
            Rental.calculateTotalAmount(rentals)
        );
    }
}
