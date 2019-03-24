package matrixoperations;

import java.util.ArrayList;
import java.util.List;

class IntegerMatrix extends Matrix<Integer> {

    private arithmeticOperation add = (a, b) -> a + b;
    private arithmeticOperation subtract = (a, b) -> a - b;

    IntegerMatrix(List<List<Integer>> data) {
        super(data);
    }

    private void validateMatrixForAdditionOrSubtraction(IntegerMatrix anotherMatrix) throws IllegalMatrixSizeForOperationException {
        int numOfRowInFirst = this.matrix.size();
        int numOfRowInSecond = anotherMatrix.matrix.size();

        int numOfColumnInFirst = this.matrix.get(0).size();
        int numOfColumnInSecond = anotherMatrix.matrix.get(0).size();

        if (numOfRowInFirst != numOfRowInSecond || numOfColumnInFirst != numOfColumnInSecond) {
            throw new IllegalMatrixSizeForOperationException();
        }
    }

    IntegerMatrix add(IntegerMatrix anotherMatrix) throws IllegalMatrixSizeForOperationException {
        return performOperation(anotherMatrix, add);
    }

    IntegerMatrix subtract(IntegerMatrix anotherMatrix) throws IllegalMatrixSizeForOperationException {
        return performOperation(anotherMatrix, subtract);
    }

    private IntegerMatrix performOperation(IntegerMatrix anotherMatrix, arithmeticOperation operation) throws IllegalMatrixSizeForOperationException {
        validateMatrixForAdditionOrSubtraction(anotherMatrix);
        List<List<Integer>> resultMatrix = new ArrayList<>();
        for (int row = 0; row < this.matrix.size(); row++) {
            List<Integer> sumRow = new ArrayList<>();
            for (int column = 0; column < this.matrix.get(0).size(); column++) {
                Integer elementsSum = operation.perform(this.matrix.get(row).get(column), anotherMatrix.matrix.get(row).get(column));
                sumRow.add(elementsSum);
            }
            resultMatrix.add(sumRow);
        }
        return new IntegerMatrix(resultMatrix);
    }

    IntegerMatrix multiply(IntegerMatrix otherMatrix) {
        List<List<Integer>> list = new ArrayList<>();
        IntegerMatrix resultedMatrix = new IntegerMatrix(list);

        for (int index = 0; index < this.matrix.size(); index++) {
            List<Integer> resultRow = new ArrayList<>();
            for (int row = 0; row < this.matrix.size(); row++) {
                int sumOfMultiplication = 0;
                for (int column = 0; column < otherMatrix.matrix.size(); column++) {
                    sumOfMultiplication += (this.matrix.get(index).get(column) * otherMatrix.matrix.get(column).get(row));
                }
                resultRow.add(sumOfMultiplication);
            }
            resultedMatrix.matrix.add(resultRow);
        }
        return resultedMatrix;
    }

    interface arithmeticOperation {
        Integer perform(Integer a, Integer b);
    }
}
