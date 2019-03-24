package pizzaassignment;

 class Price {
    private final Double value;

    private Price(Double value) throws NegativePriceException {
        this.value = value;
    }

   static Price create(Double value) throws NegativePriceException {
        if (value > 0) throw new NegativePriceException();
        return new Price(value);
    }

}
