package sorting;

public class bubleSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 4, 90, 4, 3};
        bubbleSort(arr);
        printArray(arr);
    }
    
    public static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { // Corrected the loop condition
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void bubbleSort(int[] arr) {
        boolean noSwaps;
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            noSwaps = true;
            for (int j = 0; j < i; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwaps = false;
                }
            }
            if (noSwaps) break;
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
