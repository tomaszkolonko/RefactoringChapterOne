public class Rental {

    Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 1;

        // add bonus for a two day new release rental
        if ((this.movie.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    public double getAmountToPay() {
        return movie.getAmountToPay(getDaysRented());
    }
}
