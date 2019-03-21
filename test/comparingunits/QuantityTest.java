package comparingunits;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void compareOneFeetWithTwelveInches() {
        Quantity oneFeet = new Quantity(Unit.feet,new BigDecimal(1));
        Quantity twelveFeet = new Quantity(Unit.inch,new BigDecimal(12));
        assertTrue(oneFeet.compareWith(twelveFeet));
    }

    @Test
    void compareTwoInchesWithFiveCentimetre() {
        Quantity fiveCentimeter = new Quantity(Unit.centimeter,new BigDecimal(5));
        Quantity twoInch = new Quantity(Unit.inch, new BigDecimal(2));
        assertTrue(fiveCentimeter.compareWith(twoInch));
    }

    @Test
    void compareOneCentimeterWithTenMillimeter() {
        Quantity oneCentimeter = new Quantity(Unit.centimeter,new BigDecimal(1));
        Quantity tenMillimeter = new Quantity(Unit.millimeter,new BigDecimal(10));
        assertTrue(oneCentimeter.compareWith(tenMillimeter));
    }
}