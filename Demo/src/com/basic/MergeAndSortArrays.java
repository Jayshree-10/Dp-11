package com.basic;
import java.util.*;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        int ar1[] = {1, 2, 4, 6, 10};
        int ar2[] = {4, 5, 6, 9, 12};

        // Merge the arrays
        int mergedLength = ar1.length + ar2.length;
        int[] mergedArray = new int[mergedLength];
        System.arraycopy(ar1, 0, mergedArray, 0, ar1.length);
        System.arraycopy(ar2, 0, mergedArray, ar1.length, ar2.length);

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Remove duplicates
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : mergedArray) {
            uniqueElements.add(num);
        }

        // Convert set to array
        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            resultArray[index++] = num;
        }

        // Print the result
        System.out.print("Output: {");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
