package Lessons.Lesson10Employee;

public class PartTimeEmployee extends AbstractTimeEmployee {
    private double salaryPerHour;
    private int numberOfHoursWorked;
    public PartTimeEmployee(String name,double salaryPerHour,int numberOfHoursWorked){
        super(name);
        this.salaryPerHour = salaryPerHour;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
   public void calculateSalary() {
        setSalaryGross(this.salaryPerHour * this.numberOfHoursWorked);
        setSalaryNet(getSalaryGross() - getTax());
    }

    @Override
    public String toString() {
        return String.format("[PartTime Employee %s has %.2f $ net salary]",getName(),getSalaryNet());
    }
}
