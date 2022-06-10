package ch.sbb.codequality.workshop.movie;

import java.util.List;

public class Statement {

    private String title;

    private List<String> rentals;

    private int frequenterPoints;
    private double totalAmount;

    public String getTitle() {
        return title;
    }

    public Statement withTitle(final String title) {
        this.title = title;
        return this;
    }

    public List<String> getRentals() {
        return rentals;
    }

    public Statement withRentals(final List<String> rentals) {
        this.rentals = rentals;
        return this;
    }

    public int getFrequenterPoints() {
        return frequenterPoints;
    }

    public Statement withFrequenterPointsInfo(final int frequenterPointsInfo) {
        this.frequenterPoints = frequenterPointsInfo;
        return this;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Statement withTotalAmountInfo(final double totalAmountInfo) {
        this.totalAmount = totalAmountInfo;
        return this;
    }
}
