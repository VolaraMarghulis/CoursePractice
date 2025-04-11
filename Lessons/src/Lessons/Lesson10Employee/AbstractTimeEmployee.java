package Lessons.Lesson10Employee;

   abstract class AbstractTimeEmployee {
   private final double tax = 0.20;
   private String name;
   private double salaryGross;
   private double salaryNet;

    AbstractTimeEmployee(String name){
        this.name = name;
    }
    abstract void calculateSalary();

    public double getTax() {
        return tax;
    }

    public double getSalaryGross() {
        return salaryGross;
    }
    public void setSalaryGross(double salaryGross) {
        this.salaryGross = salaryGross;
    }

    public double getSalaryNet() {
        return salaryNet;
    }
    public void setSalaryNet(double salaryNet) {
        this.salaryNet = salaryNet;
    }

    public String getName() {
        return name;
    }
}
