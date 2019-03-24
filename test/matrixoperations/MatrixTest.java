package matrixoperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {
    private List<List<Integer>> matrix = new ArrayList<>();
    private List<List<Integer>> otherMatrix = new ArrayList<>();

    @BeforeEach
    void setUp() {
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(1, 2, 3));

        otherMatrix.add(Arrays.asList(1, 2, 3));
        otherMatrix.add(Arrays.asList(1, 2, 3));
        otherMatrix.add(Arrays.asList(1, 2, 3));

    }

    @Test
    void shouldTransposeTheMatrix() {
        Matrix<Integer> matrix = new Matrix<>(this.matrix);

        List<List<Integer>> resultedMatrix = new ArrayList<>();
        resultedMatrix.add(Arrays.asList(1, 1, 1));
        resultedMatrix.add(Arrays.asList(2, 2, 2));
        resultedMatrix.add(Arrays.asList(3, 3, 3));

        Matrix<Integer> expected = new Matrix<>(resultedMatrix);
        Matrix<Integer> actual = matrix.transpose();

        assertEquals(expected, actual);
    }

    @Test
    void shouldTransposeNonSquareMatrix() {
        List<List<Integer>> nonSquareMatrix = new ArrayList<>();
        nonSquareMatrix.add(Arrays.asList(1, 1));
        nonSquareMatrix.add(Arrays.asList(2, 2));
        nonSquareMatrix.add(Arrays.asList(3, 3));

        Matrix<Integer> matrix = new Matrix<>(nonSquareMatrix);

        List<List<Integer>> resultedMatrix = new ArrayList<>();
        resultedMatrix.add(Arrays.asList(1, 2, 3));
        resultedMatrix.add(Arrays.asList(1, 2, 3));

        Matrix<Integer> expected = new Matrix<>(resultedMatrix);
        Matrix<Integer> actual = matrix.transpose();

        assertEquals(expected, actual);
    }

}