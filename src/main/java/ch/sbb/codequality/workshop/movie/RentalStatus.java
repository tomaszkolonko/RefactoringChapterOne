package ch.sbb.codequality.workshop.movie;

import java.util.List;

public record RentalStatus(String title, List<Rental> rentals, int frequenterPoints, double totalAmount) {

}
