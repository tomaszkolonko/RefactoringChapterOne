public class NewReleasePrice extends Price {
    @Override
    double getPrice(int rentedDays) {
        return rentedDays * 3;
    }
}
