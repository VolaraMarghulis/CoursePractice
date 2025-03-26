package Lessons.Lesson9;
import java.math.BigDecimal;

class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    final double calculateMonthlyInterest(){
        return (savingsBalance + annualInterestRate) / 12;
    }
    static void modifyInterestRate(double newValue){
        annualInterestRate = newValue;
    }

}
