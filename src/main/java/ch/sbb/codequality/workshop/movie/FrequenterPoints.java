package ch.sbb.codequality.workshop.movie;

import java.util.Collection;
import java.util.stream.Stream;

public class FrequenterPoints {

    final public static FrequenterPoints ONE = new FrequenterPoints(1);
    final public static FrequenterPoints TWO = new FrequenterPoints(2);
    final private int points;

    public FrequenterPoints(final int points) {
        this.points = points;
    }
    
    public static int total(Collection<FrequenterPoints> frequenterPoints) {
        return frequenterPoints.stream().mapToInt(frequenterPoint -> frequenterPoint.points).sum();
    }
}
