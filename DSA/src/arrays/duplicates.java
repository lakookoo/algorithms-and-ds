import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicates {
//     Best Score
// Given an array, write a function to get first, second best scores from the array and return it in new array.

// Array may contain duplicates.

    public static int[] findTopTwoScores(int[] array){
      int firstHighest = Integer.MIN_VALUE;
      int secondHighest = Integer.MIN_VALUE;

      for(int score : array) {
        if (score > firstHighest){
            secondHighest = firstHighest;
            firstHighest = score;
        } else if (score > secondHighest && score < firstHighest) {
            secondHighest = score;
        }
      }

      return new int[]{firstHighest, secondHighest};
    }

    // Missing Number
    // Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
    
    // Example
    
    // myArray = {1,2,3,4,6}
    // findMissingNumberInArray(myArray, 6) // 5
    // Hint:
    
    // Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.

    static int findMissingNumberInArray(int[] arr, int number) {
      int expectedSum = (number * ( number + 1))/2;
      int actualSum = 0;
      for (int num : arr){
        actualSum += num;
      }
      return expectedSum - actualSum;
    }
  
    public static Integer[] removeDuplicates(int[] arr) {
      Set<Integer> set = new HashSet<>();
      for (Integer num : arr){
        set.add(num);
      }
      Integer[] uniqueArr = set.toArray(new Integer[0]);
      return uniqueArr;

    }

    public static int[] removeDuplicates2(int[] arr) {
      Set<Integer> set = new HashSet<>();
      for (Integer num : arr){
        set.add(num);
      }
      int[] uniqueArr = new int[set.size()];
      int index = 0;
      for (int num : set) {
        uniqueArr[index++] = num;
      }
      return uniqueArr;

    }

    public static boolean areThereDuplicates(int[] arr) {
      Map<Integer, Integer> lookup = new HashMap<>();
      for (int el : arr){
        if (lookup.containsKey(el)) {
          lookup.put(el, lookup.get(el) + 1);
        } else {
          lookup.put(el, 1);
        }
      }

      for (int key : lookup.keySet()) {
        if (lookup.get(key) >= 2){
          return true;
        }
      }
      return false;
    }

    //Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

   public int removeDuplicates3(int[] nums) {
        if(nums.length == 0) return 0;
        //int current = 0;
        int next_unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[next_unique] = nums[i];
                next_unique += 1;
            }
        }
        return next_unique;
    

}
  
  }