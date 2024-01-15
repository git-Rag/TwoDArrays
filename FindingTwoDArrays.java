import java.util.Scanner;

public class FindingTwoDArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //Array
        int[][] numbers = new int[rows][cols];

        //Loop for taking input
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //Taking in number to find
        System.out.println("Enter the number which you want to find in the matrix: ");
        int x = sc.nextInt();

        //Searching for number and taking output
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (numbers[i][j] == x){
                    System.out.println("The coordinates of the number you were finding are: (" + i + "," + j + ").");
                }
            }
        }
    }
}
