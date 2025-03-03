package new_Package.employee_Package;
//import another class
import new_Package.salary_Package.Salary_start;
public class Employee {
   String name;

   public Employee(String name){
       this.name = name;
   }
   //Get info about employee
    public String info(){
       return "Employee " + name + " has: " + String.format("%.2f",Salary_start.calcSalaryPerDayNet(13.5f,8)) + "$";
    }
}
