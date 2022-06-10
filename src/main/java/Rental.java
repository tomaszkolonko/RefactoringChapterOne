public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    double getAmountToPay() {
        return movie.calculatePrice(daysRented);
    }

    public String createTitle() {
        return  movie.createTitleWithAmount(getAmountToPay());
    }

    public FrequenterPoints frequentRenterPoints() {
        return movie.frequentRenterPoints(daysRented);
    }
}
