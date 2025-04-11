package Lessons.Lesson10Employee;

public class FullTimeEmployee extends AbstractTimeEmployee{
    private double monthSalary;
    public FullTimeEmployee(String name, double monthSalary){
        super(name);
        this.monthSalary = monthSalary;
    }
    @Override
    public void calculateSalary() {
        setSalaryGross(this.monthSalary);
        setSalaryNet(getSalaryGross() - getTax());
    }

    @Override
    public String toString() {
        return String.format("[FullTime Employee %s has %.2f $ net salary]",getName(),getSalaryNet());
    }
}
