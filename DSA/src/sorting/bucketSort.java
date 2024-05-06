package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    int arr[];
    public  bucketSort(int[] arr){
        this.arr = arr;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public void printBucket(ArrayList<Integer>[] buckets){
        for(int i = 0; i < buckets.length; i++){
            System.out.println("\nBuckets " + i + ":");
            for(int j = 0; j < buckets[i].size(); j++){
                System.out.println(buckets[i].get(j) + " ");
            }
        }
    }

    // bucket sorting
    public void bucketSort() {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for(int value : arr){
            if (value > maxValue){
                maxValue = value;
            }
        }
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for( int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for (int value : arr){
            int bucketNumber = (int)Math.ceil((float)value * numberOfBuckets/(float)maxValue);
            buckets[bucketNumber - 1].add(value);
        }

        printBucket(buckets);
        for(ArrayList<Integer> bucket : buckets){
            Collections.sort(bucket);
        }
        printBucket(buckets);

        int index = 0;
        for(ArrayList<Integer> bucket : buckets){
            for(int value : bucket){
                arr[index] = value;
                index++;
            }
        }
    }
}
