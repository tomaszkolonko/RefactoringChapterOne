import java.util.function.Function;

public enum PriceCode {
    REGULAR(rentedDays -> FrequenterPoints.ONE),
    CHILDREN(rentedDays -> FrequenterPoints.ONE),
    NEW_RELEASE(rentedDays -> rentedDays > 1 ? FrequenterPoints.TWO : FrequenterPoints.ONE);

    final private Function<Integer, FrequenterPoints> frequenterPoints;

    PriceCode(Function<Integer, FrequenterPoints> frequenterPoints) {
        this.frequenterPoints = frequenterPoints;
    }

    public FrequenterPoints calculateFrequenterPoints(final Integer integer) {
        return frequenterPoints.apply(integer);
    }

}
