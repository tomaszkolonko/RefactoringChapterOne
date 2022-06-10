import java.util.function.Function;

public enum PriceCode {
    REGULAR(
        rentedDays -> FrequenterPoints.ONE,
        rentedDays -> rentedDays > 2 ? 2 + (rentedDays - 2) + 1.5 : 2.0
    ),
    NEW_RELEASE(
        rentedDays -> rentedDays > 1 ? FrequenterPoints.TWO : FrequenterPoints.ONE,
        rentedDays -> rentedDays * 3.0
    ),
    CHILDREN(
        rentedDays -> FrequenterPoints.ONE,
        rentedDays -> rentedDays > 3 ? 1.5 + (rentedDays - 3) * 1.5 : 1.5
    );

    final private Function<Integer, FrequenterPoints> frequenterPoints;
    final private Function<Integer, Double> price;

    PriceCode(Function<Integer, FrequenterPoints> frequenterPoints, final Function<Integer, Double> price) {
        this.frequenterPoints = frequenterPoints;
        this.price = price;
    }

    public FrequenterPoints calculateFrequenterPoints(final Integer integer) {
        return frequenterPoints.apply(integer);
    }

    public Double calculatePrice(final Integer integer) {
        return price.apply(integer);
    }
}
