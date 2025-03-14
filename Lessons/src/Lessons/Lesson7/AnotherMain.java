package Lessons.Lesson7;
import java.util.Scanner;

public class AnotherMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //TODO 2. Write a program to print numbers from 1 to 10.
        for (int i = 1 ; i <= 10; i++){
            System.out.print(i + " ");
        }
    //TODO 3.Write a program that prompts user for a positive integer.
    // The program shall read the input as int; and print the "reverse" of the input integer.
        System.out.println();
        System.out.print("Input the number to reverse: ");
        int number = sc.nextInt();

        int reversedNumber = 0;
        while (number > 0){
            //use to take the last number
            // 12345 % 10 = 5
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            //use to remove last digit
            //12345 / 10 = 1234
            number /= 10;
        }
        System.out.println(reversedNumber);
    }
}
