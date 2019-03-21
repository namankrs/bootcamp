package comparingunits;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void convertToBaseUnit() {
        Unit feet = Unit.FEET;
        BigDecimal actual = feet.convertToBaseUnit(new BigDecimal(1));
        BigDecimal expected = new BigDecimal(300);
        assertEquals(expected,actual);
    }


}