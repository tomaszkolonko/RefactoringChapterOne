public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    double getAmountToPay() {
        double result = 0.0;
        switch (movie.getPriceCode()) {
            case REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) + 1.5;
                }
                break;
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDREN:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                    break;
                }
        }
        return result;
    }

    public String createTitle() {
        return  movie.createTitleWithAmount(getAmountToPay());
    }

    public FrequenterPoints frequentRenterPoints() {
        return movie.frequentRenterPoints(daysRented);
    }
}
