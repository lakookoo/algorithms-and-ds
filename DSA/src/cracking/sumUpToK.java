package cracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sumUpToK {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 7, 8, 9};
        int k = 7;

        List<List<Integer>> pairs = findPairs(nums, k);

        // Print the pairs that sum up to k
        System.out.println("Pairs that sum up to " + k + ":");
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }

    
    public static List<List<Integer>> findPairs(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : arr){
            int compliment = k - num;
            if(map.containsKey(compliment) && (compliment != num || map.get(compliment) > 1)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(compliment);
                result.add(pair);
            }
        }
        return result;
    }
}
