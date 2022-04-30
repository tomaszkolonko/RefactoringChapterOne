package com.refactoring;

import com.refactoring.price.ChildrensPrice;
import com.refactoring.price.NewReleasePrice;
import com.refactoring.price.Price;
import com.refactoring.price.RegularPrice;

public class Movie {

    private static final int CHILDREN = 2;
    private static final int REGULAR = 0;
    private static final int NEW_RELEASE = 1;

    private final String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        price = switch(priceCode) {
            case REGULAR -> new RegularPrice();
            case CHILDREN -> new ChildrensPrice();
            case NEW_RELEASE -> new NewReleasePrice();
            default -> throw new IllegalArgumentException("nonexistent price code");
        };
    }

    String getTitle() {
        return title;
    }

    double getAmountToPay(int daysRented) {
        return price.getPrice(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
