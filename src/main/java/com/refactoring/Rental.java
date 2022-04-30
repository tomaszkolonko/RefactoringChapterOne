package com.refactoring;

public class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    public double getAmountToPay() {
        return movie.getAmountToPay(daysRented);
    }

    public String statement() {
        return "\t" + movie.getTitle() + "\t" + getAmountToPay() + "\n";
    }

    public String htmlStatement() {
        return movie.getTitle() + ": " + getAmountToPay() + "<br>\n";
    }
}
