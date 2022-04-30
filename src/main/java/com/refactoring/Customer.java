package com.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return this.name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental rental : rentals) {
            // shows figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getAmountToPay() + "\n";
        }

        // add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<h1>Rentals for <em>" + getName() + "</em></h1><p>\n";

        for(Rental rental : rentals) {
            result += rental.getMovie().getTitle() + ": "
                    + rental.getAmountToPay() + "<br>\n";
        }

        result += "<p>You owe <em>" + getTotalAmount() + "</em><p>\n";
        result += "On this rental you earned <em>" + getFrequentRenterPoints() + "</em> frequent renter points<p>";
        return result;
    }

    private int getFrequentRenterPoints() {
        int frequenterPoints = 0;
        for (Rental rental : rentals) {
            frequenterPoints += rental.getFrequentRenterPoints();
        }
        return frequenterPoints;
    }

    private double getTotalAmount() {
        double amountToPay = 0.0;
        for (Rental rental : rentals) {
            amountToPay += rental.getAmountToPay();
        }
        return amountToPay;
    }

}
