package com.abunko.leson1.rotateMatrix;

/**
 * Created by Andrew on 13.07.2017.
 */
public class Matrix {
    private final int size;
    private final int[][] matrix;

    Matrix(int size) {
        this.size = size;
        matrix = new int[size][size];
        fill();
    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    private void fill() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = size * i + j;
            }
        }
    }

    public void rotate90() {
        for (int k = 0; k < size / 2; k++) {
            for (int j = k; j < size - 1 - k; j++) {
                int tmp = matrix[k][j];
                matrix[k][j] = matrix[j][size - 1 - k];
                matrix[j][size - 1 - k] = matrix[size - 1 - k][size - 1 - j];
                matrix[size - 1 - k][size - 1 - j] = matrix[size - 1 - j][k];
                matrix[size - 1 - j][k]  = tmp;
            }
        }
    }

    public void rotate180(){
        this.rotate90();
        this.rotate90();
    }

    public void  rotate270(){
        this.rotate90();
        this.rotate180();
    }
}
