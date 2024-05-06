import sorting.bucketSort;
public class App {
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 12, 80, 4};
        bucketSort bs= new bucketSort(arr);
        bs.printArray(arr);
        bs.bucketSort();
        bs.printArray(arr);
    }
}
