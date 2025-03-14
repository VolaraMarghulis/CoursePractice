package Lesson5;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Is odd or even");
        System.out.println("2. Rectangle");
        System.out.println("3. Positive or Negative");
        System.out.println("4. Temperature");
        System.out.println("5. Discount");
        System.out.println("6. Movie ticket");
        System.out.println("7. Leap year");
        System.out.println("8. Exam Score");
        System.out.println("9. Discount for student");
        System.out.println("10. Password");
        System.out.println("0. Exit");
        boolean isOn = true;
       while (isOn){
           System.out.print("Print a number from the Menu: " );
           byte menuNumber = sc.nextByte();

           switch (menuNumber) {
               case 1:
                   System.out.print("Input the number: ");
                   int isOddOrEven = sc.nextInt();
                   if (isOddOrEven % 2 == 0) System.out.println(isOddOrEven + " is odd.");
                   else System.out.println(isOddOrEven + " is even.");
                   break;
               case 2:
                   System.out.print("Input the length for first rectangle: ");
                   int length1 = sc.nextInt();
                   System.out.print("Input the width for first rectangle: ");
                   int width1 = sc.nextInt();
                   System.out.print("Input the length for second rectangle: ");
                   int length2 = sc.nextInt();
                   System.out.print("Input the width for second rectangle: ");
                   int width2 = sc.nextInt();
                   int area1 = length1 * width1;
                   int area2 = length2 * width2;
                   if (area1 > area2) System.out.println("The first rectangle has the greater area " + area1);
                   else if (area1 < area2) System.out.println("The second rectangle has the greater area " + area2);
                   else System.out.println("The second rectangle is equals " + area2 + " = " + area1);
                   break;
               case 3:
                   System.out.print("Input float - number: ");
                   float floatNumber = sc.nextFloat();
                   if (floatNumber < 0) {
                       System.out.println("negative");
                       if (Math.abs(floatNumber) > 1_000_000) {
                           System.out.println("large");
                       }
                   } else if (floatNumber > 0) {
                       System.out.println("positive");
                       if (Math.abs(floatNumber) > 1_000_000) {
                           System.out.println("large");
                       }
                   } else {
                       System.out.println("zero");
                   }
                   break;
               case 4:
                   System.out.print("Input temperature : ");
                   int celsius = sc.nextInt();
                   if (celsius < 10) System.out.println("Wear a jacket!");
                   else if (celsius >= 10 && celsius <= 25) System.out.println("It's a nice day!");
                   else System.out.println("It's very hot, stay hydrated!");
                   break;
               case 5:
                   System.out.print("Input ammount: ");
                   float ammount = sc.nextFloat();
                   if (ammount > 100) System.out.println("The price with discount " + ammount * 0.9);
                   else System.out.println("The price without discount " + ammount);
                   break;
               case 6:
                   System.out.print("Input the person age: ");
                   int age = sc.nextInt();
                   String result = (age < 12) ? "Ticket price: $5" :
                                   (age >= 12 && age <= 60) ? "Ticket price:$10" :
                                   (age > 60) ? "Ticket price: $7" : "Wrong input";
                   System.out.println(result);
                   break;
               case 7:
                   System.out.print("Input a year: ");
                   int year = sc.nextInt();
                   if(year % 400 == 0) System.out.println("The " + year + " is a leap year");
                   else if(year % 4 == 0 && year % 100 != 0) System.out.println("The " + year + " is a leap year");
                   else System.out.println("The " + year + " isn't a leap year");
                   break;
               case 8:
                   System.out.print("Input exam score range 0 - 100 : ");
                   byte score = sc.nextByte();
                   if (score >= 90 && score <= 100) System.out.println("A");
                   else if (score >= 80 && score < 90) System.out.println("B");
                   else if  (score >= 70 && score < 80) System.out.println("C");
                   else if (score >= 60 && score < 70) System.out.println("D");
                   else if (score >= 0 && score < 60) System.out.println("F");
                   else System.out.println("Wrong score, check the range!");
                   break;
               case 9:
                   System.out.print("Input the student age: ");
                   byte ageStudent = sc.nextByte();
                   System.out.print("Input if is a student (true/false): ");
                   boolean isStudent = sc.nextBoolean();
                   if (isStudent || ageStudent < 18) System.out.println("20% dicount");
                   else System.out.println("No discount");
                   break;
               case 10:
                   System.out.print("Input the password: ");
                   String password = sc.nextLine();
                   if (password.length() < 6) System.out.println("Weak password");
                   else if (password.length() > 6 && password.length() < 12) System.out.println("Moderate password");
                   else System.out.println("Strong password");
                   break;
               case 0:
                   isOn = false;
                   break;
           }
       }
    }
}
