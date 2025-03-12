package Lesson3.employee_Package;
//import another class
import Lesson3.salary_Package.SalaryStart;
public class Employee {
   String name;

   public Employee(String name){
       this.name = name;
   }
   //Get info about employee
    public String info(){
       return "Employee " + name + " has: " + String.format("%.2f",
               SalaryStart.calcSalaryPerDayNet(13.5f,8))
               + "$";
    }
}
