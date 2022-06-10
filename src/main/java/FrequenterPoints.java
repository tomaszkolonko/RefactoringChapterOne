import java.util.stream.Stream;

public class FrequenterPoints {
    final private int points;

    final public static FrequenterPoints ONE = new FrequenterPoints(1);
    final public static FrequenterPoints TWO = new FrequenterPoints(2);


    public FrequenterPoints(final int points) {
        this.points = points;
    }
    
    public static int total(Stream<FrequenterPoints> frequenterPoints) {
        return frequenterPoints.mapToInt(frequenterPoint -> frequenterPoint.points).sum();
    }
}
