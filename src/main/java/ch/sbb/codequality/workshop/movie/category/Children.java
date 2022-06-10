package ch.sbb.codequality.workshop.movie.category;

import ch.sbb.codequality.workshop.movie.FrequenterPoints;

public class Children implements MovieCategory {

    @Override
    public FrequenterPoints calculateFrequenterPoints(final int daysRented) {
        return FrequenterPoints.ONE;
    }

    @Override
    public Double calculatePrice(final int rentedDays) {
        return rentedDays > 3 ? 1.5 + (rentedDays - 3) * 1.5 : 1.5;
    }
}
