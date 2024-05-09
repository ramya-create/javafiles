package day_4_5_tasks;

public class Constructor_Matrix {
    private int r;
    private int c;
    private int[][] d;

    public Constructor_Matrix(int rows, int columns) {
        this.r = rows;
        this.c = columns;
        this.d = new int[rows][columns];
    }

    public void Matrix1(int[][] values) {
        if (values.length != r || values[0].length != c) {
            System.out.println("Invalid dimensions for input values.");
            return;
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                this.d[i][j] = values[i][j];
            }
        }
    }

    // Other methods for matrix operations could go here...

    public static void main(String[] args) {
        int[][] inputValues = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Constructor_Matrix matrix = new Constructor_Matrix(3, 3);
        matrix.Matrix1(inputValues);

        // You can add more code here to test other functionalities of the Matrix class
    }
}
