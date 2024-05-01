package arrays;
import java.util.Arrays;


public class permutations {
    public boolean permutation(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
            sum2 += arr2[i];
            mul1 *= arr1[i];
            mul2 *= arr2[i];
        }
        if((sum1 == sum2)&&(mul1 == mul2)) return true;
        else return false;
    }

    public boolean permutation2(int[] array1, int[] array2){
        if(array1.length != array2.length) return false;
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i ++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
