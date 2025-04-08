
/**
 * Write a description of class array2d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array2d
{
   public static void main(String[] args) {
        // Create a 2D array with 3 rows and 4 columns
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Print the 2D array using nested for-each loops
        System.out.println("Printing 2D array using for-each loops:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        // Example of modifying elements using traditional for loops
        System.out.println("\nDoubling each element:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= 2;
            }
        }

        // Print the modified array
        System.out.println("Modified array:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}