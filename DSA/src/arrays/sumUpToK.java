package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sumUpToK {
    // frequency counter
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i}
            }
            map.put(nums[i], i);
        }
         return new int[0];
        
    }
    // multiple pointers on sorted array
    public boolean findPairSumUpToK(int[] arr, int k){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int sum = arr[start] + arr[end];
            if(k == sum) return true;
            else if (k < sum) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }

    public  int findPairMaxProduct(int[] arr){
        // Arrays.sort(arr);
        // multiple pointers 
        int maxProduct = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int product = arr[start] * arr[end];
            maxProduct = Math.max(maxProduct, product);
            start++;
            end--;
            
        }
        return maxProduct;
    }
}
