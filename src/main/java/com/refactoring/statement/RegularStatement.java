package com.refactoring.statement;

import com.refactoring.Rental;

import java.util.List;

public class RegularStatement extends Statement {
    @Override
    public String statement(String name, List<Rental> rentals) {
        String result = "Rental Record for " + name + "\n";

        for (Rental rental : rentals) {
            result += rental.statement();
        }

        result += "Amount owed is " + getTotalAmount(rentals) + "\n";
        result += "You earned " + getFrequentRenterPoints(rentals) + " frequent renter points";
        return result;
    }
}
