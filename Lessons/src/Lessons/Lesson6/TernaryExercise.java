package Lessons.Lesson6;
import java.util.Scanner;

public class TernaryExercise {
    public static void main(String[] args) {
      boolean isOn = true;
      Scanner sc = new Scanner(System.in);
        System.out.println("---Menu---");
        System.out.println("1 problem");
        System.out.println("2 problem");
        System.out.println("3 problem");
        System.out.println("4 problem");
        System.out.println("5 Exit");
      while(isOn){
          System.out.println("Input number at range 1 to 6");
          byte menu = sc.nextByte();
          switch (menu){
              case 1:
          //TODO 1. Determining an age category (minor, young, adult, senior) nested ternary.
                  System.out.print("Input the age: ");
                  byte age = sc.nextByte();
                  String categoryOfAge = (age < 18) ? "Minor" :
                                         (age >= 18 && age <= 29) ? "Young" :
                                         (age >= 30 && age <= 64) ? "Adult" :
                                         (age >= 65) ? "Senior" : "";
                  System.out.println(categoryOfAge); break;
              case 2:
          //TODO 2. Determining a person's status based on age and marital status.
                  System.out.print("Input the age: ");
                  byte ageOf = sc.nextByte();
                  System.out.print("Input true ore false is marriage: ");
                  boolean isMarriage = sc.nextBoolean();
                  if (ageOf < 18 && isMarriage == false || ageOf >= 18 && isMarriage == false) System.out.println("Not eligible for discounts");
                  else if (ageOf < 18 && isMarriage == true || ageOf >= 18 && isMarriage == true) System.out.println("Eligible for discounts");
                  break;
              case 3:
          //TODO 4.	Simplify the following sequence by nesting so that the effect is the same, but fewer comparisons are required. You may want to incorporate this code into a full program for testing purposes.
                  /**if (temperature > maxTemp){
                   * System.out.println("Porridge is too hot.");}
                   * if (temperature < minTemp){
                   * System.out.println("Porridge is too cold.");}
                   * if (temperature >= minTemp && temperature <= maxTemp){
                   * System.out.println("Porridge is just right.");}*/
                  System.out.print("Input the temperature: ");
                  byte temp = sc.nextByte();
                  System.out.print("Input the maxim temperature: ");
                  byte maxTemp = sc.nextByte();
                  System.out.print("Input the minim temperature: ");
                  byte minTemp = sc.nextByte();
                  if (temp >= minTemp && temp <= maxTemp) System.out.println("Porridge is just right.");
                  else if (temp > maxTemp) System.out.println("Porridge is too hot.");
                  else if(temp < minTemp) System.out.println("Porridge is just right.");
                  break;
              case 4:
          //TODO 5. Rewrite the given code to use ternary if instead of switch.
             /*
              int colorCode = 101;
              String color = null;
              switch(colorCode) {
              case 100 :
              color = "Yellow";
              break;
              case 101 :
              color = "Green";
              break;
              case 102 :
              color = "Red";
              break;
              default :
              color = "Invalid";}
              System.out.println("Color --- "+color);}*/
                  int colorCode = 101;
                  String color = null;
                  color = (colorCode == 100) ? "Yellow" :
                          (colorCode == 101) ? "Green" :
                          (colorCode == 102) ? "Red" : "Invalid";
                  System.out.println("Color ---" + color); break;
              case 5:
                  isOn = false;
              }
      }
    }
}
