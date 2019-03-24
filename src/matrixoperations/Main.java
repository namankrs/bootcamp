package matrixoperations;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IllegalMatrixSizeForOperationException {


//        Matrix<Integer> integerMatrix = new Matrix<>(Arrays.asList(Arrays.asList(1, 2),
//                Arrays.asList(1, 2)));
//        Matrix transpose = integerMatrix.transpose();
//        transpose.print();

        IntegerMatrix integerMatrix = new IntegerMatrix(Arrays.asList(Arrays.asList(1, 2),
                Arrays.asList(1, 2)));
        IntegerMatrix sumOfMatrices = integerMatrix.add(integerMatrix);
        sumOfMatrices.print();
        IntegerMatrix difference = integerMatrix.subtract(integerMatrix);
        difference.print();

        IntegerMatrix multiply = integerMatrix.multiply(integerMatrix);
        multiply.print();
    }

}
