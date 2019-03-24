package matrixoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Matrix<T> {
    final List<List<T>> matrix;

    Matrix(List<List<T>> data) {
        this.matrix = data;
    }

    void print() {
        System.out.println();
        this.matrix.forEach(row -> {
            row.forEach(element -> System.out.printf(" %s ", element));
            System.out.println();
        });
    }

    Matrix<T> transpose() {
        List<List<Integer>> list = new ArrayList<>();
        Matrix resultedMatrix = new Matrix(list);
        for (int row = 0; row < this.matrix.get(0).size(); row++) {
            List<Integer> resultRow = new ArrayList<>();
            for (List<T> rowElements : this.matrix) {
                resultRow.add((Integer) rowElements.get(row));
            }
            resultedMatrix.matrix.add(resultRow);
        }
        return resultedMatrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix<?> matrix1 = (Matrix<?>) o;
        return Objects.equals(matrix, matrix1.matrix);
    }


}
