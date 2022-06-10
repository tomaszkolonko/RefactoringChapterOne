package ch.sbb.codequality.workshop.movie;

import java.util.List;

public record Statement(String title, List<String> rentals, int frequenterPoints, double totalAmount) {

}
