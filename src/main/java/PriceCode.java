public abstract class PriceCode {

    public static PriceCode REGULAR = new PriceCode() {
        @Override
        public FrequenterPoints calculateFrequenterPoints(final Integer integer) {
            return FrequenterPoints.ONE;
        }

        @Override
        public Double calculatePrice(final Integer rentedDays) {
            return rentedDays > 2 ? 2 + (rentedDays - 2) + 1.5 : 2.0;
        }
    };

    public static PriceCode NEW_RELEASE = new PriceCode() {
        @Override
        public FrequenterPoints calculateFrequenterPoints(final Integer rentedDays) {
            return rentedDays > 1 ? FrequenterPoints.TWO : FrequenterPoints.ONE;
        }

        @Override
        public Double calculatePrice(final Integer rentedDays) {
            return rentedDays * 3.0;
        }
    };

    public static PriceCode CHILDREN = new PriceCode() {
        @Override
        public FrequenterPoints calculateFrequenterPoints(final Integer integer) {
            return FrequenterPoints.ONE;
        }

        @Override
        public Double calculatePrice(final Integer rentedDays) {
            return rentedDays > 3 ? 1.5 + (rentedDays - 3) * 1.5 : 1.5;
        }
    };

    public abstract FrequenterPoints calculateFrequenterPoints(final Integer integer);

    public abstract Double calculatePrice(final Integer integer);
}
