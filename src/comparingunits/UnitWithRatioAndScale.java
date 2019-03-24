package comparingunits;

import java.math.BigDecimal;
import java.math.RoundingMode;

class UnitWithRatioAndScale extends Unit {

    private static final int CELSIUS_TO_CELSIUS_CONVERSION_FACTOR = 1;
    private static final double CELSIUS_TO_CELSIUS_CONVERSION_SCALE = 0;
    static final Unit CELSIUS = new UnitWithRatioAndScale(new BigDecimal(CELSIUS_TO_CELSIUS_CONVERSION_FACTOR), Type.TEMPERATURE, new BigDecimal(CELSIUS_TO_CELSIUS_CONVERSION_SCALE));
    private static final double FAHRENHEIT_TO_CELSIUS_CONVERSION_FACTOR = 0.56;
    private static final double FAHRENHEIT_TO_CELSIUS_CONVERSION_SCALE = -32D;
    static final Unit FAHRENHEIT = new UnitWithRatioAndScale(new BigDecimal(FAHRENHEIT_TO_CELSIUS_CONVERSION_FACTOR), Type.TEMPERATURE, new BigDecimal(FAHRENHEIT_TO_CELSIUS_CONVERSION_SCALE));

    private BigDecimal scale;

    private UnitWithRatioAndScale(BigDecimal conversionRatio, Type type, BigDecimal scale) {
        super(conversionRatio, type);
        this.scale = scale;
    }

    @Override
    BigDecimal convertToBaseUnit(BigDecimal value) {
        return this.conversionRatio.multiply(value.add(this.scale)).setScale(0, RoundingMode.FLOOR);
    }

    @Override
    BigDecimal convertToUnit(BigDecimal value) {
        return (value.divide(this.conversionRatio, RoundingMode.HALF_UP)).subtract(this.scale);

    }


}

