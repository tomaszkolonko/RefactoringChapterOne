package ch.sbb.codequality.workshop.movie;

import ch.sbb.codequality.workshop.movie.category.JsonUtil;
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

        final Statement statement = new Statement()
            .withTitle(name)
            .withRentals(rentals.stream().map(Rental::createTitle).toList())
            .withTotalAmountInfo(Rental.calculateTotalAmount(rentals))
            .withFrequenterPointsInfo(Rental.calculateFrequenterPoints(rentals));

        return JsonUtil.writeAsJson(statement);
    }



}
