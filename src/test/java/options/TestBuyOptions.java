package options;

import all.manager.buy.Ticket;
import all.menus.options.BuyOptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBuyOptions {
    @Test
    void testToString() {

        BuyOptions buyOptions= new BuyOptions();
        assertEquals("Income=0",buyOptions.toString() );

    }



//Enums are singletons so I can't test them becouse they are private made




}
