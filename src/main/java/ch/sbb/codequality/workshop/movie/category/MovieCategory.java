package ch.sbb.codequality.workshop.movie.category;

import ch.sbb.codequality.workshop.movie.FrequenterPoints;

public interface MovieCategory {

    MovieCategory REGULAR = new Regular();

    MovieCategory NEW_RELEASE = new NewRelease();

    MovieCategory CHILDREN = new Children();

    FrequenterPoints calculateFrequenterPoints(final int daysRented);

    Double calculatePrice(final int daysRented);
}
