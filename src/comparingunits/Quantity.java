package comparingunits;

import java.math.BigDecimal;

class Quantity {
    private Unit unit;
    private BigDecimal value;

    Quantity(Unit unit, BigDecimal value) {
        this.unit = unit;
        this.value = value;
    }


    private BigDecimal convertToBaseUnit() {
        return BigDecimal.valueOf(this.unit.convertToBaseUnit(this.value).floatValue());
    }


    @Override
    public boolean equals(Object anotherQuantity) {
        if (!(anotherQuantity instanceof Quantity)) return false;
        if (this == anotherQuantity) return true;
        if (getClass() != anotherQuantity.getClass()) return false;
        Quantity otherQuantity = (Quantity) anotherQuantity;
        if (this.unit.isNotOfSameType(otherQuantity.unit)) return false;
        return this.convertToBaseUnit().equals(otherQuantity.convertToBaseUnit());
    }

    Quantity add(Quantity otherQuantity) throws IncompatibleTypeException, InvalidOperationException {
        if (this.unit.isNotOfSameType(otherQuantity.unit)) throw new IncompatibleTypeException();
        if (!this.unit.isSummable()) throw new InvalidOperationException();
        BigDecimal addedValueInBaseUnit = this.convertToBaseUnit().add(otherQuantity.convertToBaseUnit());
        BigDecimal valueInThisUnit = this.unit.convertToUnit(addedValueInBaseUnit);
        return new Quantity(this.unit, valueInThisUnit);
    }
}
