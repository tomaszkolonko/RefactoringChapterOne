public class NewReleasePrice extends Price {
    @Override
    double getPrice(int rentedDays) {
        return rentedDays * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
