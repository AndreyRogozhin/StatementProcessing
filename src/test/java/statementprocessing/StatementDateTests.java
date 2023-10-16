package statementprocessing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StatementDateTests {

    @Test
    public void isOutOfDateTest(){
        Statement statement = new Statement("20231015", "Королев Сергей", "07", "inProgress", 500);

        assertEquals("Факт просрочки определен неверно", false, statement.isOutOfDate());
    }

}
