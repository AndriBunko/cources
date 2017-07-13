package com.abunko.leson1.rotateMatrix;

/**
 * Created by Andrew on 13.07.2017.
 */
public class MatrixRunner {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4);
        Matrix matrix1 = new Matrix(4);
        Matrix matrix2 = new Matrix(4);

        matrix.printMatrix();
        matrix.rotate90();
        matrix.printMatrix();

        matrix1.rotate180();
        matrix1.printMatrix();

        matrix2.rotate270();
        matrix2.printMatrix();

    }
}
