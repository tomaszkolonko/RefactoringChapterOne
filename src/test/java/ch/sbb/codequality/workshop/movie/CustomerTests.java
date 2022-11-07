package ch.sbb.codequality.workshop.movie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ch.sbb.codequality.workshop.movie.category.MovieCategory;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CustomerTests {

    private final static Movie treeOfLife = new Movie("Tree of Life", MovieCategory.REGULAR);
    private final static Movie Alibaba = new Movie("Alibaba", MovieCategory.CHILDREN);
    private final static Movie starTrek = new Movie("Star Trek: new Generations", MovieCategory.NEW_RELEASE);

    private final static Rental RENTAL_2_TREEOFLIFE = new Rental(treeOfLife, 2);
    private final static Rental RENTAL_5_TREEOFLIFE = new Rental(treeOfLife, 5);
    private final static Rental RENTAL_2_ALIBABA = new Rental(Alibaba, 2);
    private final static Rental RENTAL_2_STARTREK = new Rental(starTrek, 2);

    @Test
    void testPatrickStatement() {
        // given
        RentalStatus expected = new RentalStatus("Rental record for Patrick", List.of(RENTAL_2_TREEOFLIFE), 1, 2.0);

        // when
        Customer patrick = new Customer("Patrick");
        patrick.addRental(RENTAL_2_TREEOFLIFE);

        // then
        assertEquals(expected, patrick.rentalStatus());
    }

    @Test
    void testSandraStatement() {
        // given
        RentalStatus expected = new RentalStatus("Rental record for Sandra", List.of(RENTAL_2_ALIBABA), 1, 1.5);

        // when
        Customer sandra = new Customer("Sandra");
        sandra.addRental(RENTAL_2_ALIBABA);

        // then
        assertEquals(expected, sandra.rentalStatus());

    }

    @Test
    void testMaxStatement() {
        // given
        RentalStatus expected = new RentalStatus("Rental record for Max", List.of(RENTAL_2_STARTREK), 2, 6.0);

        // when
        Customer max = new Customer("Max");
        max.addRental(RENTAL_2_STARTREK);

        // then
        assertEquals(expected, max.rentalStatus());
    }

    @Test
    void testSeveralRentals() {
        // given
        RentalStatus expected = new RentalStatus("Rental record for Sonja",
            List.of(RENTAL_2_TREEOFLIFE, RENTAL_2_ALIBABA),
            2,
            3.5);

        // when
        Customer sonja = new Customer("Sonja");
        sonja.addRental(RENTAL_2_TREEOFLIFE);
        sonja.addRental(RENTAL_2_ALIBABA);

        // then
        assertEquals(expected, sonja.rentalStatus());
    }

    @Test
    void testFor5DayRental() {
        // given
        Customer patrick = new Customer("Patrick");
        RentalStatus expected = new RentalStatus("Rental record for Patrick", List.of(RENTAL_5_TREEOFLIFE), 1, 6.5);

        // when
        patrick.addRental(RENTAL_5_TREEOFLIFE);

        // then
        assertEquals(expected, patrick.rentalStatus());
    }

}
