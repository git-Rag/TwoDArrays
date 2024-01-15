import java.util.*;
public class TwoDArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Defining Array
        int[][] numbers = new int[rows][cols];

        //Taking inputs
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();

            }
        }
        //To print
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }


    }
}
