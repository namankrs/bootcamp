//package matrixoperations;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class NumberMatrix extends Matrix<Number> {
//
//    private arithmeticOperation add = (a, b) -> a+b;
//    private arithmeticOperation subtract = (a, b) -> a - b;
//
//    NumberMatrix(List<List<Number>> data) {
//        super(data);
//    }
//
//    private void validateMatrixForAdditionOrSubtraction(NumberMatrix anotherMatrix) throws IllegalMatrixSizeForOperationException {
//        int numOfRowInFirst = this.matrix.size();
//        int numOfRowInSecond = anotherMatrix.matrix.size();
//
//        int numOfColumnInFirst = this.matrix.get(0).size();
//        int numOfColumnInSecond = anotherMatrix.matrix.get(0).size();
//
//        if (numOfRowInFirst != numOfRowInSecond || numOfColumnInFirst != numOfColumnInSecond) {
//            throw new IllegalMatrixSizeForOperationException();
//        }
//    }
//
//
//    private void validateMatrixForMultiplication(Matrix anotherMatrix) throws IllegalMatrixSizeForOperationException {
//        int numOfRowInFirst = this.matrix.get(0).size();
//
//        int numOfColumnInSecond = anotherMatrix.matrix.size();
//
//        if (numOfRowInFirst != numOfColumnInSecond) {
//            throw new IllegalMatrixSizeForOperationException();
//        }
//    }
//
//
//    NumberMatrix add(NumberMatrix anotherMatrix) throws IllegalMatrixSizeForOperationException {
//        return performOperation(anotherMatrix, add);
//    }
//
//    NumberMatrix subtract(NumberMatrix anotherMatrix) throws IllegalMatrixSizeForOperationException {
//        return performOperation(anotherMatrix, subtract);
//    }
//
//    private NumberMatrix performOperation(NumberMatrix anotherMatrix, arithmeticOperation operation) throws IllegalMatrixSizeForOperationException {
//        validateMatrixForAdditionOrSubtraction(anotherMatrix);
//        List<List<Number>> resultMatrix = new ArrayList<>();
//        for (int row = 0; row < this.matrix.size(); row++) {
//            List<Number> resultRow = performOperationOnRow(anotherMatrix, operation, row);
//            resultMatrix.add(resultRow);
//        }
//        return new NumberMatrix(resultMatrix);
//    }
//
//    private List<Number> performOperationOnRow(NumberMatrix anotherMatrix, arithmeticOperation operation, int row) {
//        List<Number> resultRow = new ArrayList<>();
//        for (int column = 0; column < this.matrix.get(0).size(); column++) {
//            Number elementsSum = operation.perform(this.matrix.get(row).get(column),
//                    anotherMatrix.matrix.get(row).get(column));
//            resultRow.add(elementsSum);
//        }
//        return resultRow;
//    }
//
//    NumberMatrix multiply(NumberMatrix otherMatrix) throws IllegalMatrixSizeForOperationException {
//        validateMatrixForMultiplication(otherMatrix);
//        List<List<Number>> list = new ArrayList<>();
//        NumberMatrix resultedMatrix = new NumberMatrix(list);
//
//        for (int index = 0; index < this.matrix.size(); index++) {
//            List<Number> resultRow = multiplyRow(otherMatrix, index);
//            resultedMatrix.matrix.add(resultRow);
//        }
//        return resultedMatrix;
//    }
//
//    private List<Number> multiplyRow(NumberMatrix otherMatrix, int index) {
//        List<Number> resultRow = new ArrayList<>();
//        for (int row = 0; row < this.matrix.size(); row++) {
//            int sumOfMultiplication = getSumOfMultiplication(otherMatrix, index, row);
//            resultRow.add(sumOfMultiplication);
//        }
//        return resultRow;
//    }
//
//    private int getSumOfMultiplication(NumberMatrix otherMatrix, int index, int row) {
//        int sumOfMultiplication = 0;
//        for (int column = 0; column < otherMatrix.matrix.size(); column++) {
//            sumOfMultiplication += this.matrix.get(index).get(column)*otherMatrix.matrix.get(column).get(row);
//        }
//        return sumOfMultiplication;
//    }
//
//    interface arithmeticOperation {
//        Number perform(Number a, Number b);
//    }
//}
