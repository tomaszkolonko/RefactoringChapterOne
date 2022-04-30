package com.refactoring.statement;

import com.refactoring.Rental;

import java.util.List;

public class HtmlStatement extends Statement {
    @Override
    public String statement(String name, List<Rental> rentals) {
        String result = "<h1>Rentals for <em>" + name + "</em></h1><p>\n";

        for(Rental rental : rentals) {
            result += rental.htmlStatement();
        }

        result += "<p>You owe <em>" + getTotalAmount(rentals) + "</em><p>\n";
        result += "On this rental you earned <em>" + getFrequentRenterPoints(rentals) + "</em> frequent renter points<p>";
        return result;
    }
}
