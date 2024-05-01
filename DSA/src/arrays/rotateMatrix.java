package arrays;

public class rotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, { 4, 5, 6}, { 7, 8, 9}};
        printMatrix(matrix);
        rotateMatrix(matrix);
        
    }
    public static void rotateMatrix(int[][] matrix){
        // transpose a matrix
        for(int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix[i].length; j++){
                swap(matrix, i, j);

            }
        }
        // reverse each row
        for(int i = 0; i < matrix.length; i ++){
            reverse(matrix, matrix[i]);
        }
        printMatrix(matrix);

    }

    public static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void reverse(int[][] matrix, int[] row){
        int left = 0;
        int right = row.length - 1;
        while(left < right){
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
