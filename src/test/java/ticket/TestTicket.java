package ticket;

import all.manager.buy.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTicket {
    @Test
    void testGetIncome() {

        Ticket ticket = new Ticket();
        assertEquals("Income=0",ticket.getIncome() );

    }
    @Test
    void testToString() {

        Ticket ticket = new Ticket();
        assertEquals("Income=0",ticket.toString() );

    }
}
