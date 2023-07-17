import java.util.Scanner;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int row = scanner.nextInt();
        System.out.println("Enter the no. of column : ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int output = findMinorDiagonalSum(matrix);
        System.out.println("Output : " + output);
    }

    private static int findMinorDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = matrix.length-1; i >= 0; i--){
            sum += matrix[i][matrix.length - i -1];
        }
        return sum;
    }
}
