import java.util.Scanner;

public class MatrixOperations{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the matrices: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Addition
        int[][] additionResult = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                additionResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Subtraction
        int[][] subtractionResult = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                subtractionResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Multiplication
        int[][] multiplicationResult = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multiplicationResult[i][j] = 0;
                for (int k = 0; k < columns; k++) {
                    multiplicationResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Trace
        int trace = 0;
        for (int i = 0; i < rows; i++) {
            trace += matrix1[i][i];
        }

        System.out.println("Addition of matrices:");
        printMatrix(additionResult);

        System.out.println("Subtraction of matrices:");
        printMatrix(subtractionResult);

        System.out.println("Multiplication of matrices:");
        printMatrix(multiplicationResult);

        System.out.println("Trace of the first matrix: " + trace);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
