package probability;

class Probability {
    private static final double MINIMUM_PROBABILITY = 0D;
    private static final double MAXIMUM_PROBABILITY = 1D;
    private final double value;

    Probability(double value) throws InvalidProbabilityException {
        validate(value);
        this.value = value;
    }

    private void validate(double value) throws InvalidProbabilityException {
        if (value < MINIMUM_PROBABILITY || value > MAXIMUM_PROBABILITY) {
            throw new InvalidProbabilityException("Invalid value for probability");
        }
    }

    @Override
    public boolean equals(Object anotherProbability) {
        if (this == anotherProbability) return true;
        if (anotherProbability == null || getClass() != anotherProbability.getClass()) return false;
        Probability that = (Probability) anotherProbability;
        return Double.compare(that.value, value) == 0;
    }

    Probability calculateImprobability() throws InvalidProbabilityException {
        return new Probability(MAXIMUM_PROBABILITY - this.value);
    }
}
