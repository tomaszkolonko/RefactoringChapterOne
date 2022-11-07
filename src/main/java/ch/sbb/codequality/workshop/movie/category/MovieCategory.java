package ch.sbb.codequality.workshop.movie.category;

import ch.sbb.codequality.workshop.movie.FrequenterPoints;

public interface MovieCategory {

    MovieCategory REGULAR = new RegularCategory();

    MovieCategory NEW_RELEASE = new NewReleaseCategory();

    MovieCategory CHILDREN = new ChildrenCategory();

    FrequenterPoints calculateFrequenterPoints(final int daysRented);

    Double calculatePrice(final int daysRented);
}
