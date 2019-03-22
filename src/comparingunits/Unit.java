package comparingunits;

import java.math.BigDecimal;

abstract class Unit {

    private final Type type;
    BigDecimal conversionRatio;

    Unit(BigDecimal conversionRatio, Type type) {
        this.conversionRatio = conversionRatio;
        this.type = type;
    }

    boolean isNotOfSameType(Unit otherUnit) {
        return this.type != otherUnit.type;
    }

    abstract BigDecimal convertToBaseUnit(BigDecimal value);

    abstract BigDecimal convertToUnit(BigDecimal value);

    abstract Boolean isSummable();


    enum Type {
        LENGTH,
        VOLUME,
        TEMPERATURE

    }
}
