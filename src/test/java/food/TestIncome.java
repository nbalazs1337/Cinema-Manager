package food;

import all.manager.statistics.Income;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestIncome {


    @Test
    void testToString() {
        Income income = new Income();
        assertEquals("Income=0", income.toString());

    }



}
