package ch.sbb.codequality.workshop.movie.category;

import ch.sbb.codequality.workshop.movie.FrequenterPoints;

public class RegularCategory implements MovieCategory {
    @Override
    public FrequenterPoints calculateFrequenterPoints(final int rentedDays) {
        return FrequenterPoints.ONE;
    }

    @Override
    public Double calculatePrice(final int rentedDays) {
        return rentedDays > 2 ? 2 + (rentedDays - 2) * 1.5 : 2.0;
    }

}
