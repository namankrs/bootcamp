package comparingunits;

public interface Summable {
    SummableQuantity add(SummableQuantity otherQuantity) throws IncompatibleTypeException;

}
