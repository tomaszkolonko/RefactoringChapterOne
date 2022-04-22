import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    private final static Movie treeOfLife = new Movie("Tree of Life", 0);
    private final static Movie Alibaba = new Movie("Alibaba", 2);
    private final static Movie starTrek = new Movie("Star Trek: new Generations", 1);

    private final static Rental rentalA = new Rental(treeOfLife, 2);
    private final static Rental rentalB = new Rental(Alibaba, 2);
    private final static Rental rentalC = new Rental(starTrek, 2);

    @Test
    void testPatrickStatement() {
        Customer patrick = new Customer("Patrick");

        patrick.addRental(rentalA);

        String patrickStatement = "Rental Record for Patrick"
                + "\n\tTree of Life\t2.0"
                + "\nAmount owed is 2.0"
                + "\nYou earned 1 frequent renter points";
        assertEquals(patrickStatement, patrick.statement());
    }

    @Test
    void testSandraStatement() {
        Customer sandra = new Customer("Sandra");

        sandra.addRental(rentalB);

        String sandraStatement = "Rental Record for Sandra"
                + "\n\tAlibaba\t1.5"
                + "\nAmount owed is 1.5"
                + "\nYou earned 1 frequent renter points";
        assertEquals(sandraStatement, sandra.statement());


    }

    @Test
    void testMaxStatement() {
        Customer max = new Customer("Max");

        max.addRental(rentalC);

        String maxStatement = "Rental Record for Max"
                + "\n\tStar Trek: new Generations\t6.0"
                + "\nAmount owed is 6.0"
                + "\nYou earned 2 frequent renter points";
        assertEquals(maxStatement, max.statement());
    }

    @Test
    void testSeveralRentals() {
        Customer sonja = new Customer("Sonja");
        sonja.addRental(rentalA);
        sonja.addRental(rentalB);

        String sonjaStatement = "Rental Record for Sonja"
                + "\n\tTree of Life\t2.0"
                + "\n\tAlibaba\t1.5"
                + "\nAmount owed is 3.5"
                + "\nYou earned 2 frequent renter points";
        assertEquals(sonjaStatement, sonja.statement());
    }

}
