package arrays;

public class rotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, { 4, 5, 6}, { 7, 8, 9}};
        printMatrix(matrix);
        rotateMatrix(matrix);
        
    }
    public static void rotateMatrix(int[][] matrix){
        // transpose an array 
        for(int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix[i].length; j++){
                swap(matrix, i, j);

            }
        }
        printMatrix(matrix);

    }

    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void printMatrix(int[][] matrix) {
        // Iterate through each row
        for (int i = 0; i < matrix.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Print the element at the current position
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
