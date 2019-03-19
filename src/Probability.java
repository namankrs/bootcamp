class Probability {
    private final double value;

    Probability(double value) throws InvalidProbabilityException {
        if(value < 0.0D || value > 1.0D){
            throw new InvalidProbabilityException("Invalid value for probability");
        }
        this.value = value;
    }
}
