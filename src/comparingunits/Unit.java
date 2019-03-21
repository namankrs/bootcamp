package comparingunits;

import java.math.BigDecimal;

class Unit {


    private static final int FEET_TO_MILLIMETER_CONVERSION_FACTOR = 300;
    static final Unit FEET = new Unit(new BigDecimal(FEET_TO_MILLIMETER_CONVERSION_FACTOR), Type.LENGTH);
    private static final int INCH_TO_MILLIMETER_CONVERSION_FACTOR = 25;
    static final Unit INCH = new Unit(new BigDecimal(INCH_TO_MILLIMETER_CONVERSION_FACTOR), Type.LENGTH);
    private static final int CENTIMETER_TO_MILLIMETER_CONVERSION_FACTOR = 10;
    static final Unit CENTIMETER = new Unit(new BigDecimal(CENTIMETER_TO_MILLIMETER_CONVERSION_FACTOR), Type.LENGTH);
    private static final int MILLIMETER_TO_MILLIMETER_CONVERSION_FACTOR = 1;
    static final Unit MILLIMETER = new Unit(new BigDecimal(MILLIMETER_TO_MILLIMETER_CONVERSION_FACTOR), Type.LENGTH);
    private static final double LITRE_TO_MILLILITRE_CONVERSION_FACTOR = .001;
    static final Unit LITRE = new Unit(new BigDecimal(LITRE_TO_MILLILITRE_CONVERSION_FACTOR), Type.VOLUME);
    private static final double GALLON_TO_MILLILITRE_CONVERSION_FACTOR = .00378;
    static final Unit GALLON = new Unit(new BigDecimal(GALLON_TO_MILLILITRE_CONVERSION_FACTOR), Type.VOLUME);
    private final Type type;
    private BigDecimal conversionRatio;
    private Unit(BigDecimal conversionRatio, Type type) {
        this.conversionRatio = conversionRatio;
        this.type = type;
    }

    boolean isNotOfSameType(Unit otherUnit) {
        return this.type != otherUnit.type;
    }

    BigDecimal convertToBaseUnit(BigDecimal value) {
        return (value.multiply(this.conversionRatio));
    }

    private enum Type {
        LENGTH,
        VOLUME
    }
}
