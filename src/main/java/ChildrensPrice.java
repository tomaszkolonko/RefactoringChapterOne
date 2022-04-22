public class ChildrensPrice extends Price {

    private final double PRICE_PER_UNIT = 1.5;
    private final int FREE_DAYS = 3;

    @Override
    double getPrice(int rentedDays) {
        double result = PRICE_PER_UNIT;
        if (rentedDays > FREE_DAYS) {
            result += (rentedDays - FREE_DAYS) * PRICE_PER_UNIT;
        }
        return result;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
