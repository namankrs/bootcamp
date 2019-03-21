package comparingunits;

import java.math.BigDecimal;

class Unit {
    static final Unit millimeter = new Unit(new BigDecimal(1));
    static final Unit feet = new Unit(new BigDecimal(300));
    static final Unit inch = new Unit(new BigDecimal(25));
    static final Unit centimeter = new Unit(new BigDecimal(10));
    private BigDecimal conversionRatio;

    private Unit(BigDecimal conversionRatio) {
        this.conversionRatio = conversionRatio;
    }

    BigDecimal convertToBaseUnit(BigDecimal value) {
        return (value.multiply(this.conversionRatio));
    }
}
