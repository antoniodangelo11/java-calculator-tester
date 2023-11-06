package org.lessons.tester;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    @Test
    @DisplayName("Prezzo Under 18")
    public void testCalculatePriceUnder18() {

        Ticket ticket = new Ticket(100,0.21, 15);
        double calculatedPrice = ticket.calculatePrice(0.0);

        assertEquals(4.2, calculatedPrice);
        assertNotEquals(25, calculatedPrice);
    }

    @Test
    @DisplayName("Prezzo Over 65")
    public void testCalculatePriceOver65() {

        Ticket ticket = new Ticket(100, 0.21, 80);
        double calculatedPrice = ticket.calculatePrice(0.0);

        assertEquals(8.4, calculatedPrice);
        assertNotEquals(15, calculatedPrice);
    }

    @Test
    @DisplayName("Prezzo Regolare")
    public void testCalculatePriceRegular() {

        Ticket ticket = new Ticket(100, 0.21, 20);
        double calculatedPrice = ticket.calculatePrice(0.0);

        assertEquals(21, calculatedPrice);
        assertNotEquals(30, calculatedPrice);
    }
}
