package comparingunits;

import java.math.BigDecimal;
import java.util.Objects;

class Quantity {
    private Unit unit;
    private BigDecimal value;

    Quantity(Unit unit, BigDecimal value) {
        this.unit = unit;
        this.value = value;
    }

    private BigDecimal convertToBaseUnit() {
        return this.unit.convertToBaseUnit(this.value);
    }

    boolean compareWith(Quantity quantity) {
        return this.convertToBaseUnit().equals(quantity.convertToBaseUnit());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Objects.equals(unit, quantity.unit) &&
                Objects.equals(value, quantity.value);
    }

}
