//package matrixoperations;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class NumberMatrixTest {
//
//    private List<List<Integer>> matrix = new ArrayList<>();
//    private List<List<Integer>> otherMatrix = new ArrayList<>();
//
//    @BeforeEach
//    void setUp() {
//        matrix.add(Arrays.asList(1, 2, 3));
//        matrix.add(Arrays.asList(1, 2, 3));
//        matrix.add(Arrays.asList(1, 2, 3));
//
//        otherMatrix.add(Arrays.asList(1, 2, 3));
//        otherMatrix.add(Arrays.asList(1, 2, 3));
//        otherMatrix.add(Arrays.asList(1, 2, 3));
//
//    }
//
//    @Test
//    void shouldAddMatrix() throws IllegalMatrixSizeForOperationException {
//        NumberMatrix matrixOperations = new NumberMatrix(matrix);
//        List<List<Integer>> resultedMatrix = new ArrayList<>();
//        resultedMatrix.add(Arrays.asList(2, 4, 6));
//        resultedMatrix.add(Arrays.asList(2, 4, 6));
//        resultedMatrix.add(Arrays.asList(2, 4, 6));
//
//        NumberMatrix expected = new NumberMatrix(resultedMatrix);
//        NumberMatrix actual = matrixOperations.add(new NumberMatrix(otherMatrix));
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void shouldSubtractMatrix() throws IllegalMatrixSizeForOperationException {
//        NumberMatrix matrixOperations = new NumberMatrix(matrix);
//        List<List<Integer>> resultedMatrix = new ArrayList<>();
//        resultedMatrix.add(Arrays.asList(0, 0, 0));
//        resultedMatrix.add(Arrays.asList(0, 0, 0));
//        resultedMatrix.add(Arrays.asList(0, 0, 0));
//
//        NumberMatrix expected = new NumberMatrix(resultedMatrix);
//        NumberMatrix actual = matrixOperations.subtract(new NumberMatrix(otherMatrix));
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void shouldMultiplyMatrix() throws IllegalMatrixSizeForOperationException {
//        NumberMatrix matrixOperations = new NumberMatrix(matrix);
//        List<List<Integer>> resultedMatrix = new ArrayList<>();
//        resultedMatrix.add(Arrays.asList(6, 12, 18));
//        resultedMatrix.add(Arrays.asList(6, 12, 18));
//        resultedMatrix.add(Arrays.asList(6, 12, 18));
//
//        NumberMatrix expected = new NumberMatrix(resultedMatrix);
//        NumberMatrix actual = matrixOperations.multiply(new NumberMatrix(otherMatrix));
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void shouldMultiplyDifferentSizeMatrix() throws IllegalMatrixSizeForOperationException {
//        List<List<Integer>> matrixToMultiply = new ArrayList<>();
//        matrixToMultiply.add(Arrays.asList(1, 2, 3));
//        matrixToMultiply.add(Arrays.asList(4, 5, 6));
//
//        List<List<Integer>> matrixToMultiply2 = new ArrayList<>();
//        matrixToMultiply2.add(Arrays.asList(7, 8));
//        matrixToMultiply2.add(Arrays.asList(9, 10));
//        matrixToMultiply2.add(Arrays.asList(11, 12));
//
//        List<List<Integer>> resultedMatrix = new ArrayList<>();
//        resultedMatrix.add(Arrays.asList(58, 64));
//        resultedMatrix.add(Arrays.asList(139, 154));
//
//        NumberMatrix matrix = new NumberMatrix(matrixToMultiply);
//        NumberMatrix expected = new NumberMatrix(resultedMatrix);
//        NumberMatrix actual = matrix.multiply(new NumberMatrix(matrixToMultiply2));
//
//        assertEquals(expected, actual);
//    }
//}