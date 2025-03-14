package Lesson3.salary_Package;

public class SalaryStart {
   //tax 20% in decimal
    static final float STANDART_TAX = 0.20f;
    static double grossSalaryPerHour;
    static float workHour;
    static float hourlyWage;

    //Method to calculate Salary per day
    public static double calcSalaryPerDayNet(float hourlyWage,float workHour){
        double salaryGrossPerDay;
        if (hourlyWage <= 0.0 || 0.0 >= workHour && workHour >= 24){
            return 0.0;
        }
        salaryGrossPerDay = hourlyWage * workHour;
      // Net Salary = Gross Salary - (Gross Salary * Tax Rate)
        return salaryGrossPerDay - (salaryGrossPerDay * STANDART_TAX);
    }
}
