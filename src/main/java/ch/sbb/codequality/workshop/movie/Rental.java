package ch.sbb.codequality.workshop.movie;

import java.util.List;

public class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public static double calculateTotalAmount(final List<Rental> rentals) {
        return rentals.stream()
            .mapToDouble(rental -> rental.movie.calculatePrice(rental.daysRented))
            .sum();
    }

    public static int calculateFrequenterPoints(final List<Rental> rentals) {
        final List<FrequenterPoints> allFrequenterPoints = rentals.stream().map(Rental::frequentRenterPoints).toList();
        return FrequenterPoints.total(allFrequenterPoints);
    }

    private FrequenterPoints frequentRenterPoints() {
        return movie.frequentRenterPoints(daysRented);
    }
}
