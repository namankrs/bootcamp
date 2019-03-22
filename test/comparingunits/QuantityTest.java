package comparingunits;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void compareOneFeetWithEquivalentInches() {
        Quantity oneFeet = new Quantity(UnitWithRatio.FEET, new BigDecimal(1));
        Quantity twelveFeet = new Quantity(UnitWithRatio.INCH, new BigDecimal(12));
        assertEquals(oneFeet, twelveFeet);
    }

    @Test
    void compareTwoInchesWithEquivalentInches() {
        Quantity fiveCentimeter = new Quantity(UnitWithRatio.CENTIMETER, new BigDecimal(5));
        Quantity twoInch = new Quantity(UnitWithRatio.INCH, new BigDecimal(2));
        assertEquals(fiveCentimeter, twoInch);
    }

    @Test
    void compareOneCentimeterWithEquivalentMillimeters() {
        Quantity oneCentimeter = new Quantity(UnitWithRatio.CENTIMETER, new BigDecimal(1));
        Quantity tenMillimeter = new Quantity(UnitWithRatio.MILLIMETER, new BigDecimal(10));
        assertEquals(oneCentimeter, tenMillimeter);
    }

    @Test
    void compareOneGallonWithEquivalentLitres() {
        Quantity oneGallon = new Quantity(UnitWithRatio.GALLON, new BigDecimal(1));
        Quantity equivalentLitre = new Quantity(UnitWithRatio.LITRE, new BigDecimal(3.78));
        assertEquals(oneGallon, equivalentLitre);
    }

    @Test
    void shouldNotCompareDifferentUnits() {
        Quantity oneGallon = new Quantity(UnitWithRatio.GALLON, new BigDecimal(1));
        Quantity oneMillimeter = new Quantity(UnitWithRatio.MILLIMETER, new BigDecimal(3.78));
        System.out.println();
        assertNotEquals(oneGallon, oneMillimeter);
    }

    @Test
    void shouldAddQuantitiesWithSameUnits() throws IncompatibleTypeException, InvalidOperationException {
        Quantity oneInch = new Quantity(UnitWithRatio.INCH, new BigDecimal(1));
        Quantity twoInch = new Quantity(UnitWithRatio.INCH, new BigDecimal(2));
        assertEquals(twoInch, oneInch.add(oneInch));
    }

    @Test
    void addShouldThrowExceptionQuantitiesOfDifferentUnit() {
        Quantity oneInch = new Quantity(UnitWithRatio.INCH, new BigDecimal(1));
        Quantity oneGallon = new Quantity(UnitWithRatio.GALLON, new BigDecimal(1));
        assertThrows(IncompatibleTypeException.class, () -> oneInch.add(oneGallon));
    }

    @Test
    void shouldAddValuesInDifferentUnitsAndReturnSumInInches() throws IncompatibleTypeException, InvalidOperationException {
        Quantity twoInch = new Quantity(UnitWithRatio.INCH, new BigDecimal(2));
        Quantity twoPointFiveCentimeter = new Quantity(UnitWithRatio.CENTIMETER, new BigDecimal(2.5));
        Quantity threeInch = new Quantity(UnitWithRatio.INCH, new BigDecimal(3));
        assertEquals(threeInch, twoInch.add(twoPointFiveCentimeter));
    }

    @Test
    void shouldAddTwoDifferentUnitsOtherThanInchesAndReturnSumInInches() throws IncompatibleTypeException, InvalidOperationException {
        Quantity oneFeet = new Quantity(UnitWithRatio.FEET, new BigDecimal(1));
        Quantity threeHundredCentimeter = new Quantity(UnitWithRatio.CENTIMETER, new BigDecimal(30));
        Quantity twoFeet = new Quantity(UnitWithRatio.FEET, new BigDecimal(2));
        assertEquals(twoFeet, oneFeet.add(threeHundredCentimeter));
    }

    @Test
    void compareTwoHundredTwelveFahrenheitWithEquivalentCelsius() {
        Quantity twoHundredTwelveFahrenheit = new Quantity(UnitWithRatioAndScale.FAHRENHEIT, new BigDecimal(32));
        Quantity hundredCelsius = new Quantity(UnitWithRatioAndScale.CELSIUS, new BigDecimal(0));
        assertEquals(twoHundredTwelveFahrenheit, hundredCelsius);
    }

    @Test
    void shouldThrowExceptionForAddingTemperatures() {
        Quantity hundredCelsius = new Quantity(UnitWithRatioAndScale.CELSIUS, new BigDecimal(100));
        assertThrows(InvalidOperationException.class, () -> hundredCelsius.add(hundredCelsius));

    }
}