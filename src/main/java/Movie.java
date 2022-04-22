public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return this.priceCode;
    }

    public void setPriceCode(int arg) {
        this.priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

    double getAmountToPay(int daysRented) {
        double result = 0.0;
        switch (getPriceCode()) {
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

    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;

        // add bonus for a two day new release rental
        if ((priceCode == Movie.NEW_RELEASE) && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
