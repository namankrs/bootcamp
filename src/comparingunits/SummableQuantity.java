package comparingunits;

import java.math.BigDecimal;

public class SummableQuantity extends Quantity implements Summable {

    SummableQuantity(Unit unit, BigDecimal value) {
        super(unit, value);
    }

    @Override
    public SummableQuantity add(SummableQuantity otherQuantity) throws IncompatibleTypeException {
        if (this.unit.isNotOfSameType(otherQuantity.unit)) throw new IncompatibleTypeException();
        BigDecimal addedValueInBaseUnit = this.convertToBaseUnit().add(otherQuantity.convertToBaseUnit());
        BigDecimal valueInThisUnit = this.unit.convertToUnit(addedValueInBaseUnit);
        return new SummableQuantity(this.unit, valueInThisUnit);
    }
}
