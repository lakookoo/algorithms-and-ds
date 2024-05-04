package sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 4, 90, 4, 3};
        selection(arr);
        printArray(arr);
    }
    public static void selection(int[] arr){
        for(int j = 0; j < arr.length; j++){
            int minimumIndex = j;
            for(int i = j + 1; i < arr.length; i++){
                if(arr[i] < arr[minimumIndex]){
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j ){
                int temp = arr[j];
                arr[j] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }
        }

    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
