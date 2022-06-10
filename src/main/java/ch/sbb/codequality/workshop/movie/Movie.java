package ch.sbb.codequality.workshop.movie;

import ch.sbb.codequality.workshop.movie.category.MovieCategory;

public class Movie {

    private final String title;
    private final MovieCategory movieCategory;

    public Movie(final String title, final MovieCategory movieCategory) {
        this.title = title;
        this.movieCategory = movieCategory;
    }

    public String createTitleWithAmount(final double amountToPay) {
        return title + "\t" + amountToPay;
    }

    public FrequenterPoints frequentRenterPoints(int daysRented) {
        return movieCategory.calculateFrequenterPoints(daysRented);
    }

    public Double calculatePrice(final Integer integer) {
        return movieCategory.calculatePrice(integer);
    }
}
