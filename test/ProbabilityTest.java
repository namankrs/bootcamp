import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test
    void shouldNotThrowExceptionWhileCreatingProbabilityWithValidValue() {
        assertDoesNotThrow(() -> new Probability(0.1D));
    }

    @Test
    void shouldThrowExceptionWhileCreatingProbabilityWithValuesGreaterThanOne() {
        assertThrows(InvalidProbabilityException.class,()->{
            new Probability(1.1D);
        });
    }

    @Test
    void shouldThrowExceptionWhileCreatingProbabilityWithValuesLessThanZero() {
        assertThrows(InvalidProbabilityException.class,()->{
            new Probability(-0.1D);
        });
    }
}