import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    private final static Movie treeOfLife = new Movie("Tree of Life", 0);
    private final static Movie Alibaba = new Movie("Alibaba", 2);
    private final static Movie starTrek = new Movie("Star Trek: new Generations", 1);

    private final static Rental RENTAL_2_TREEOFLIFE = new Rental(treeOfLife, 2);
    private final static Rental RENTAL_5_TREEOFLIFE = new Rental(treeOfLife, 5);
    private final static Rental RENTAL_2_ALIBABA = new Rental(Alibaba, 2);
    private final static Rental RENTAL_2_STARTREK = new Rental(starTrek, 2);

    @Test
    void testPatrickStatement() {
        Customer patrick = new Customer("Patrick");

        patrick.addRental(RENTAL_2_TREEOFLIFE);

        String patrickStatement = "Rental Record for Patrick"
                + "\n\tTree of Life\t2.0"
                + "\nAmount owed is 2.0"
                + "\nYou earned 1 frequent renter points";
        assertEquals(patrickStatement, patrick.statement());
    }

    @Test
    void testSandraStatement() {
        Customer sandra = new Customer("Sandra");

        sandra.addRental(RENTAL_2_ALIBABA);

        String sandraStatement = "Rental Record for Sandra"
                + "\n\tAlibaba\t1.5"
                + "\nAmount owed is 1.5"
                + "\nYou earned 1 frequent renter points";
        assertEquals(sandraStatement, sandra.statement());


    }

    @Test
    void testMaxStatement() {
        Customer max = new Customer("Max");

        max.addRental(RENTAL_2_STARTREK);

        String maxStatement = "Rental Record for Max"
                + "\n\tStar Trek: new Generations\t6.0"
                + "\nAmount owed is 6.0"
                + "\nYou earned 2 frequent renter points";
        assertEquals(maxStatement, max.statement());
    }

    @Test
    void testSeveralRentals() {
        Customer sonja = new Customer("Sonja");
        sonja.addRental(RENTAL_2_TREEOFLIFE);
        sonja.addRental(RENTAL_2_ALIBABA);

        String sonjaStatement = "Rental Record for Sonja"
                + "\n\tTree of Life\t2.0"
                + "\n\tAlibaba\t1.5"
                + "\nAmount owed is 3.5"
                + "\nYou earned 2 frequent renter points";
        assertEquals(sonjaStatement, sonja.statement());
    }

    @Test
    void testFor5DayRental() {
        Customer patrick = new Customer("Patrick");

        patrick.addRental(RENTAL_5_TREEOFLIFE);

        String patrickStatement = "Rental Record for Patrick"
                + "\n\tTree of Life\t6.5"
                + "\nAmount owed is 6.5"
                + "\nYou earned 1 frequent renter points";
        assertEquals(patrickStatement, patrick.statement());
    }

    @Test
    void testHTMLforPatrick() {
        Customer patrick = new Customer("Patrick");

        patrick.addRental(RENTAL_2_TREEOFLIFE);

        String patrickStatement = "<h1>Rentals for <em>Patrick</em></h1><p>"
                + "\nTree of Life: 2.0<br>"
                + "\n<p>You owe <em>2.0</em><p>"
                + "\nOn this rental you earned <em>1</em> frequent renter points<p>";
        assertEquals(patrickStatement, patrick.htmlStatement());
    }

}
