package comparingunits;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void compareOneFeetWithTwelveInches() {
        Quantity oneFeet = new Quantity(Unit.FEET, new BigDecimal(1));
        Quantity twelveFeet = new Quantity(Unit.INCH, new BigDecimal(12));
        assertEquals(oneFeet, twelveFeet);
    }

    @Test
    void compareTwoInchesWithFiveCentimetre() {
        Quantity fiveCentimeter = new Quantity(Unit.CENTIMETER, new BigDecimal(5));
        Quantity twoInch = new Quantity(Unit.INCH, new BigDecimal(2));
        assertEquals(fiveCentimeter, twoInch);
    }

    @Test
    void compareOneCentimeterWithTenMillimeter() {
        Quantity oneCentimeter = new Quantity(Unit.CENTIMETER, new BigDecimal(1));
        Quantity tenMillimeter = new Quantity(Unit.MILLIMETER, new BigDecimal(10));
        assertEquals(oneCentimeter, tenMillimeter);
    }

    @Test
    void compareOneGallonWithEquivalentLitres() {
        Quantity oneGallon = new Quantity(Unit.GALLON, new BigDecimal(1));
        Quantity equivalentLitre = new Quantity(Unit.LITRE, new BigDecimal(3.78));
        assertEquals(oneGallon, equivalentLitre);
    }

    @Test
    void shouldNotCompareOneGallonWithOneMillimeter() {
        Quantity oneGallon = new Quantity(Unit.GALLON, new BigDecimal(1));
        Quantity oneMillimeter = new Quantity(Unit.MILLIMETER, new BigDecimal(3.78));
        assertNotEquals(oneGallon, oneMillimeter);
    }

    @Test
    void addShouldAddIfGivenQuantitiesHaveSameUnit() throws IncompatibleTypeException {
        Quantity oneInch = new Quantity(Unit.INCH, new BigDecimal(1));
        Quantity twoInch = new Quantity(Unit.INCH, new BigDecimal(2));
        assertEquals(twoInch, oneInch.add(oneInch));
    }

    @Test
    void addShouldThrowExceptionIfGivenQuantitiesHaveDifferentUnit() {
        Quantity oneInch = new Quantity(Unit.INCH, new BigDecimal(1));
        Quantity oneGallon = new Quantity(Unit.GALLON, new BigDecimal(1));
        assertThrows(IncompatibleTypeException.class, () -> oneInch.add(oneGallon));
    }

    @Test
    void shouldAddTwoInchAndTwoPointFiveCentimeterAndReturnInInches() throws IncompatibleTypeException {
        Quantity twoInch = new Quantity(Unit.INCH, new BigDecimal(2));
        Quantity twoPointFiveCentimeter = new Quantity(Unit.CENTIMETER, new BigDecimal(2.5));
        Quantity threeInch = new Quantity(Unit.INCH, new BigDecimal(3));
        assertEquals(threeInch, twoInch.add(twoPointFiveCentimeter));
    }

    @Test
    void shouldAddTwoDifferentUnitsOtherThanInchesAndReturnSumInInches() throws IncompatibleTypeException {
        Quantity oneFeet = new Quantity(Unit.FEET, new BigDecimal(1));
        Quantity threeHundredCentimeter = new Quantity(Unit.CENTIMETER, new BigDecimal(30));
        Quantity twoFeet = new Quantity(Unit.FEET, new BigDecimal(2));
        assertEquals(twoFeet,oneFeet.add(threeHundredCentimeter));
    }
}