package probability;

class Probability {
    private static final double MINIMUM_PROBABILITY = 0D;
    private static final double MAXIMUM_PROBABILITY = 1D;
    private final double value;

    private Probability(double value) {
        this.value = value;
    }

    static Probability create(double value) throws InvalidProbabilityException {
        validate(value);
        return new Probability(value);
    }


    private static void validate(double value) throws InvalidProbabilityException {
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

    Probability not() {
        return new Probability(MAXIMUM_PROBABILITY - this.value);
    }

    Probability and(Probability anotherProbability) {
        return new Probability(this.value * anotherProbability.value);
    }

    Probability or(Probability anotherProbability) {
        return new Probability(this.value + anotherProbability.value - this.and(anotherProbability).value);
    }
}
