package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 4, 90, 4, 3};
        insertion(arr);
        printArray(arr);
    }
    public static void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i;
            while(j > 0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
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
