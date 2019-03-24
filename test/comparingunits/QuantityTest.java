package comparingunits;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
    @Test
    void compareOneFeetWithEquivalentInches() {
        SummableQuantity oneFeet = new SummableQuantity(UnitWithRatio.FEET, new BigDecimal(1));
        SummableQuantity twelveFeet = new SummableQuantity(UnitWithRatio.INCH, new BigDecimal(12));
        assertEquals(oneFeet, twelveFeet);
    }

    @Test
    void compareTwoInchesWithEquivalentInches() {
        SummableQuantity fiveCentimeter = new SummableQuantity(UnitWithRatio.CENTIMETER, new BigDecimal(5));
        SummableQuantity twoInch = new SummableQuantity(UnitWithRatio.INCH, new BigDecimal(2));
        assertEquals(fiveCentimeter, twoInch);
    }

    @Test
    void compareOneCentimeterWithEquivalentMillimeters() {
        SummableQuantity oneCentimeter = new SummableQuantity(UnitWithRatio.CENTIMETER, new BigDecimal(1));
        SummableQuantity tenMillimeter = new SummableQuantity(UnitWithRatio.MILLIMETER, new BigDecimal(10));
        assertEquals(oneCentimeter, tenMillimeter);
    }

    @Test
    void compareOneGallonWithEquivalentLitres() {
        SummableQuantity oneGallon = new SummableQuantity(UnitWithRatio.GALLON, new BigDecimal(1));
        SummableQuantity equivalentLitre = new SummableQuantity(UnitWithRatio.LITRE, new BigDecimal(3.78));
        assertEquals(oneGallon, equivalentLitre);
    }

    @Test
    void shouldNotCompareDifferentUnits() {
        SummableQuantity oneGallon = new SummableQuantity(UnitWithRatio.GALLON, new BigDecimal(1));
        SummableQuantity oneMillimeter = new SummableQuantity(UnitWithRatio.MILLIMETER, new BigDecimal(3.78));
        System.out.println();
        assertNotEquals(oneGallon, oneMillimeter);
    }

    @Test
    void shouldAddQuantitiesWithSameUnits() throws IncompatibleTypeException {
        SummableQuantity oneInch = new SummableQuantity(UnitWithRatio.INCH, new BigDecimal(1));
        SummableQuantity twoInch = new SummableQuantity(UnitWithRatio.INCH, new BigDecimal(2));
        assertEquals(twoInch, oneInch.add(oneInch));
    }

    @Test
    void addShouldThrowExceptionQuantitiesOfDifferentUnit() {
        SummableQuantity oneInch = new SummableQuantity(UnitWithRatio.INCH, new BigDecimal(1));
        SummableQuantity oneGallon = new SummableQuantity(UnitWithRatio.GALLON, new BigDecimal(1));
        assertThrows(IncompatibleTypeException.class, () -> oneInch.add(oneGallon));
    }

    @Test
    void shouldAddValuesInDifferentUnitsAndReturnSumInInches() throws IncompatibleTypeException {
        SummableQuantity twoInch = new SummableQuantity(UnitWithRatio.INCH, new BigDecimal(2));
        SummableQuantity twoPointFiveCentimeter = new SummableQuantity(UnitWithRatio.CENTIMETER, new BigDecimal(2.5));
        SummableQuantity threeInch = new SummableQuantity(UnitWithRatio.INCH, new BigDecimal(3));
        assertEquals(threeInch, twoInch.add(twoPointFiveCentimeter));
    }

    @Test
    void shouldAddTwoDifferentUnitsOtherThanInchesAndReturnSumInInches() throws IncompatibleTypeException {
        SummableQuantity oneFeet = new SummableQuantity(UnitWithRatio.FEET, new BigDecimal(1));
        SummableQuantity threeHundredCentimeter = new SummableQuantity(UnitWithRatio.CENTIMETER, new BigDecimal(30));
        SummableQuantity twoFeet = new SummableQuantity(UnitWithRatio.FEET, new BigDecimal(2));
        assertEquals(twoFeet, oneFeet.add(threeHundredCentimeter));
    }

    @Test
    void compareTwoHundredTwelveFahrenheitWithEquivalentCelsius() {
        SummableQuantity twoHundredTwelveFahrenheit = new SummableQuantity(UnitWithRatioAndScale.FAHRENHEIT, new BigDecimal(32));
        SummableQuantity hundredCelsius = new SummableQuantity(UnitWithRatioAndScale.CELSIUS, new BigDecimal(0));
        assertEquals(twoHundredTwelveFahrenheit, hundredCelsius);
    }

}