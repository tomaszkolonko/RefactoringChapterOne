package ch.sbb.codequality.workshop.movie.category;

import ch.sbb.codequality.workshop.movie.FrequenterPoints;

public class NewRelease implements MovieCategory {

    @Override
    public FrequenterPoints calculateFrequenterPoints(final int rentedDays) {
        return rentedDays > 1 ? FrequenterPoints.TWO : FrequenterPoints.ONE;
    }

    @Override
    public Double calculatePrice(final int rentedDays) {
        return rentedDays * 3.0;
    }
}
