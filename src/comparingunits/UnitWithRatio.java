package comparingunits;

import java.math.BigDecimal;
import java.math.RoundingMode;

class UnitWithRatio extends Unit {

    private static final int FEET_TO_INCH_CONVERSION_FACTOR = 12;
    static final Unit FEET = new UnitWithRatio(new BigDecimal(FEET_TO_INCH_CONVERSION_FACTOR), Type.LENGTH);


    private static final int INCH_TO_INCH_CONVERSION_FACTOR = 1;
    static final Unit INCH = new UnitWithRatio(new BigDecimal(INCH_TO_INCH_CONVERSION_FACTOR), Type.LENGTH);

    private static final double CENTIMETER_TO_INCH_CONVERSION_FACTOR = 0.4;
    static final Unit CENTIMETER = new UnitWithRatio(new BigDecimal(CENTIMETER_TO_INCH_CONVERSION_FACTOR), Type.LENGTH);

    private static final double MILLIMETER_TO_INCH_CONVERSION_FACTOR = 0.04;
    static final Unit MILLIMETER = new UnitWithRatio(new BigDecimal(MILLIMETER_TO_INCH_CONVERSION_FACTOR), Type.LENGTH);

    private static final double LITRE_TO_LITRE_CONVERSION_FACTOR = 1;
    static final Unit LITRE = new UnitWithRatio(new BigDecimal(LITRE_TO_LITRE_CONVERSION_FACTOR), Type.VOLUME);

    private static final double GALLON_TO_LITRE_CONVERSION_FACTOR = 3.78;
    static final Unit GALLON = new UnitWithRatio(new BigDecimal(GALLON_TO_LITRE_CONVERSION_FACTOR), Type.VOLUME);


    private UnitWithRatio(BigDecimal conversationRatio, Type type) {
        super(conversationRatio, type);

    }

    @Override
    BigDecimal convertToUnit(BigDecimal value) {
        return value.divide(this.conversionRatio, RoundingMode.HALF_UP);

    }


    @Override
    BigDecimal convertToBaseUnit(BigDecimal value) {
        return (value.multiply(this.conversionRatio));
    }
}
