
/**
 * Write a description of class allelements2d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class allelements2d
{
    public static void main(String[] args){
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };
        System.out.println("The Elements are :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+"");

            }
            System.out.println();
        }
    }
}