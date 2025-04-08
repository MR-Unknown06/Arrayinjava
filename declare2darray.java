
/**
 * Write a description of class declare2darray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class declare2darray
{
    public static void main(String[] args) {
        int[][] num = {
            {1, 2, 3},
            {5, 6, 56, 8},
            {9, 7, 90, 19, 4}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("Element at row " + i + "= c " + j + ": " + num[i][j]);
            }
        }
    }
}