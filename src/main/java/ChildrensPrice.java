public class ChildrensPrice extends Price {

    @Override
    double getPrice(int rentedDays) {
        double result = 1.5;
        if (rentedDays > 3) {
            result += (rentedDays - 3) * 1.5;
        }
        return result;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
