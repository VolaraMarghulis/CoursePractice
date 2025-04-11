package Lessons.Lesson10Employee;

public class Freelance extends AbstractTimeEmployee {
   private double projectPrice;
   public Freelance(String name, double projectPrice){
        super(name);
        this.projectPrice = projectPrice;
    }
    @Override
    void calculateSalary() {
        setSalaryGross(this.projectPrice);
        setSalaryNet(getSalaryGross() - getTax());
    }
    @Override
    public String toString() {
        return String.format("[Freelance Employee %s has %.2f $ net salary per Project]",getName(),getSalaryNet());
    }
}
