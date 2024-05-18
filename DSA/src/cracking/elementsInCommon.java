package cracking;
// Given two sorted arrays find some elements in common

// The arrays are the same length and each has distinct elements

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class elementsInCommon {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4, 5, 6 };

        System.out.println("Elements in common " + findElementsInCommon(arr1, arr2));
        System.out.println("Elements in common " + findElementsInCommon2(arr1, arr2));
    }

    /**
     * @param arr1
     * @param arr2
     * @return
     */
    public static int findElementsInCommon(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : arr2) {
            set2.add(num);
        }
        set1.retainAll(set2); // retain only the elements that are common to both sets

        System.out.println("Intersection: " + set1); // Output: Intersection: [3, 4]
        int number = set1.size();
        return number;
    }

    public static int findElementsInCommon2(int[] arr1, int[] arr2){
        int count = 0;
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        for( int el : arr2){
            if(set1.contains(el)){
                count++;
            }
        }
        return count;
    }
}
