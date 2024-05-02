package recursion;

public class productOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int product = prodOfArray(array, 0);
        int product2 = prodOfArray2(array);
        System.out.println("Product of array elements: " + product);
        System.out.println("Product of array elements: " + product2);
    }
    public static int prodOfArray(int[] arr, int index){
        if ( index == arr.length - 1) return arr[index];
        return arr[index]*prodOfArray(arr, index + 1);
    }

    public static int prodOfArray2(int[] arr){
        int product = 1;
        for(int el : arr){
            product *= el;
        }
        return product;
    }
}
