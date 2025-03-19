package Lessons.Lesson8;
import java.util.ArrayList;
import java.util.Arrays;

class ArrayMethods {
    //TODO 1. Declare an array of type int.
    // Allocate memory for this array and initialize it with different numeric values.
    static final String calcSumAvgArray(int[] uniArray) {
        int sum = 0;
        double avg = 0.0;
        //verifying if array is empty
        if (uniArray == null && uniArray.length < 1) return "";
        for (int arr : uniArray) {
            sum += arr;
        }
        avg = sum / uniArray.length;
        return String.format("Sum is : %d, and Avg is: %.2f", sum, avg);
    }
    //Overload method
    static final String calcSumAvgArray(int[][] twoArray) {
        int sum = 0;
        double avg = 0.0;
        //verifying if array is empty
        if (twoArray == null && twoArray.length < 1) return "";
        for (int[] row : twoArray) {
            for (int num : row) {
                sum += num;
            }
        }
        avg = sum / twoArray.length;
        return String.format("Sum is : %d, and Avg is: %.2f", sum, avg);
    }
    // TODO 2. Make a Java program to copy Write a Java program to find the maximum and minimum value of an array.the elements of one array to another array.
    static final int[] copyToAnotherArray(int[] a, int[] b) {
        int[] combineArray = new int[a.length + b.length];
        //through first array
        for (int i = 0; i < a.length; i++) {
            combineArray[i] = a[i];
        }
        //through second array
        for (int j = 0; j < b.length; j++) {
            combineArray[a.length + j] = b[j];
        }
        return combineArray;
    }
    //TODO 3. Write a Java program to find the maximum and minimum value of an array.
    static final String findMaxAnMin(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int arr : array){
            if (min > arr) min = arr;
            if (max < arr) max = arr;
        }
        return String.format("Minimum number is: %d, Maximum number is: %d",min,max);
    }
    //TODO 4 Write a Java program to test if an array contains a specific value.
    static final boolean containsElement(int[] array, int value){
        if (array == null && array.length < 1) return false;
        for (int arr : array){
            if (value == arr) return true;
        }
        return false;
    }

}