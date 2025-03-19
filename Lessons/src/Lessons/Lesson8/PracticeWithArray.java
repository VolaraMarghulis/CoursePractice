package Lessons.Lesson8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeWithArray {
    public static void main(String[] args) {
        int[] arr1 = {2,6,7,0,1};
        int[] arr2 = {3,4,5,8};
        int[][] arr3 = {{1,5,11,10},{13,16,18}};
        System.out.println("Test 1");
        System.out.println(ArrayMethods.calcSumAvgArray(arr1));
        System.out.println(ArrayMethods.calcSumAvgArray(arr3));
        System.out.println("Test 2");
        int[] result = ArrayMethods.copyToAnotherArray(arr1,arr2);
        System.out.println(Arrays.toString(result));
        System.out.println("Test 3");
        System.out.println(ArrayMethods.containsElement(arr1, 1));
    }
}