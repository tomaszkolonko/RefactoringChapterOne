public class Movie {

    private final String title;
    private final PriceCode priceCode;

    public Movie(final String title, final PriceCode priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public PriceCode getPriceCode() {
        return this.priceCode;
    }

    public String createTitleWithAmount(final double amountToPay) {
        return title + "\t" + amountToPay;
    }

    public FrequenterPoints frequentRenterPoints(int daysRented) {
        return priceCode.calculateFrequenterPoints(daysRented);
    }
}
