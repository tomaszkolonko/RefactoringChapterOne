public class RegularPrice extends Price {
    @Override
    double getPrice(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) + 1.5;
        }
        return result;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
