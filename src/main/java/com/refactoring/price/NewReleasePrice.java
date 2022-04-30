package com.refactoring.price;

public class NewReleasePrice extends Price {

    private final int PRICE_PER_UNIT = 3;
    private final int DOUBLE_RENTER_POINTS = 2;
    private final int SINGLE_RENTER_POINTS = 1;

    @Override
    public double getPrice(int rentedDays) {
        return rentedDays * PRICE_PER_UNIT;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? DOUBLE_RENTER_POINTS : SINGLE_RENTER_POINTS;
    }
}
