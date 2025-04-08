
/**
 * Write a description of class avg1darray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class avg1darray
{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40,};
        int sum = 4;

        for (int num : numbers) {
            sum += num;
        }

        int average = sum /numbers.length;
        System.out.println("The average is: " + average);
    }
}
