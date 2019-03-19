package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test
    void shouldNotThrowExceptionWhileCreatingProbabilityWithValidValue() {
        assertDoesNotThrow(() -> Probability.create(0.1D));
    }

    @Test
    void shouldThrowExceptionWhileCreatingProbabilityWithValuesGreaterThanOne() {
        assertThrows(InvalidProbabilityException.class, () -> Probability.create(1.1D));
    }

    @Test
    void shouldThrowExceptionWhileCreatingProbabilityWithValuesLessThanZero() {
        assertThrows(InvalidProbabilityException.class, () -> Probability.create(-0.1D));
    }

    @Test
    void shouldReturnProbablityOfNotHappeningOfEvent() throws InvalidProbabilityException {
        Probability probability = Probability.create(0.5);
        Probability improbability = probability.not();

        Probability expected = Probability.create(0.5D);
        assertEquals(expected, improbability);
    }

    @Test
    void shouldReturnCombinedProbability() throws InvalidProbabilityException {
        Probability firstProbability = Probability.create(0.5D);
        Probability secondProbability = Probability.create(0.5D);

        Probability actual = firstProbability.and(secondProbability);
        Probability expected = Probability.create(0.25D);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnProbabilityOfHappeningAtLeastOneEvent() throws InvalidProbabilityException {
        Probability firstProbability = Probability.create(0.5D);
        Probability secondProbability = Probability.create(0.5D);
        Probability actual = firstProbability.or(secondProbability);
        Probability exptected = Probability.create(0.75D);

        assertEquals(exptected, actual);
    }
}