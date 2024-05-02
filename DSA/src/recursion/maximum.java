package recursion;

public class maximum {
    public static void main(String[] args) {
        int[] array = { 3, 7, 2, 9, 5 };
        int max = findMaximum(array, 0);
        System.out.println("Max value in the array: " + max);
    }

    public static int findMaximum(int[] arr, int index){
        if(index == arr.length - 1) {
            return arr[index];
        }
        int maxRest = findMaximum(arr, index+1);
        return Math.max(arr[index], maxRest);
    }

    public static int findMaxIteratively(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}