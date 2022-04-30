package com.refactoring.statement;

import java.util.List;
import com.refactoring.*;

public abstract class Statement {
    abstract String statement(String name, List<Rental> rentals);

    int getFrequentRenterPoints(List<Rental> rentals) {
        int frequenterPoints = 0;
        for (Rental rental : rentals) {
            frequenterPoints += rental.getFrequentRenterPoints();
        }
        return frequenterPoints;
    }

    double getTotalAmount(List<Rental> rentals) {
        double amountToPay = 0.0;
        for (Rental rental : rentals) {
            amountToPay += rental.getAmountToPay();
        }
        return amountToPay;
    }
}
