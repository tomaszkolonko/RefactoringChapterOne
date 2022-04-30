package price;

import price.Price;

public class RegularPrice extends Price {

    private final double PRICE_PER_UNIT = 2;
    private final int FREE_DAYS = 2;
    private final double LATE_PENALTY = 1.5;

    @Override
    public double getPrice(int daysRented) {
        double result = PRICE_PER_UNIT;
        if (daysRented > FREE_DAYS) {
            result += (daysRented - FREE_DAYS) + LATE_PENALTY;
        }
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
