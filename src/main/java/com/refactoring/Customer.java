package com.refactoring;

import com.refactoring.statement.HtmlStatement;
import com.refactoring.statement.RegularStatement;

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

    public String regularStatement() {
        RegularStatement regularStatement = new RegularStatement();
        return regularStatement.statement(name, rentals);
    }

    public String htmlStatement() {
        HtmlStatement htmlStatement = new HtmlStatement();
        return htmlStatement.statement(name, rentals);
    }

}
