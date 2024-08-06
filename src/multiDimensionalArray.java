import java.util.Scanner;

public class multiDimensionalArray {

    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt user to enter number of rows and columns
        System.out.print("Enter Rows: ");
        int rows = in.nextInt();
        System.out.print("Enter Columns: ");
        int columns = in.nextInt();

        // Initialize a 2D array (matrix) with the specified number of rows and columns
        int matrix[][] = new int[rows][columns];

        // Input Matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter Element at (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = in.nextInt();
            }
        }

        // Print matrix elements with their positions
        System.out.println("Matrix elements with their positions:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Element at (" + (i + 1) + "," + (j + 1) + "): " + matrix[i][j]);
            }
        }

        // Print the entire matrix
        System.out.println("The entire matrix:");
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("|");
            System.out.println();
        }

        // Close the scanner to avoid resource leak
        in.close();
    }
}

/*
 * Explanation:
 * 
 * 1. A Scanner object is created to read user input.
 * 2. The user is prompted to enter the number of rows and columns for the matrix.
 * 3. A 2D array (matrix) is initialized with the specified number of rows and columns.
 * 4. The user is prompted to input elements for each position in the matrix.
 * 5. The matrix elements along with their positions are printed.
 * 6. The entire matrix is printed in a formatted manner, using '|' to separate columns and rows.
 * 7. The Scanner is closed to prevent resource leaks.
 */
