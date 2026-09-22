import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        String rowStr = input.nextLine();
        int _rows = Integer.parseInt(rowStr);

        System.out.print("Input number of columns: ");
        String colStr = input.nextLine();
        int _cols = Integer.parseInt(colStr);

        int[][] _matrix1 = new int[_rows][_cols];
        int[][] _matrix2 = new int[_rows][_cols];
        int[][] _sumMatrix = new int[_rows][_cols];

        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < _rows; i++) {
            for (int j = 0; j < _cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                _matrix1[i][j] = Integer.parseInt(input.nextLine());
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < _rows; i++) {
            for (int j = 0; j < _cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                _matrix2[i][j] = Integer.parseInt(input.nextLine());
            }
        }

        for (int i = 0; i < _rows; i++) {
            for (int j = 0; j < _cols; j++) {
                _sumMatrix[i][j] = _matrix1[i][j] + _matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < _rows; i++) {
            for (int j = 0; j < _cols; j++) {
                System.out.print(_sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}