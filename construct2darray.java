
/**
 * Write a description of class construct2darray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class construct2darray
{
    public static void main(String[] args) {

         int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6, 79},
            {7, 8, 9, 79, 78}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
   }
}