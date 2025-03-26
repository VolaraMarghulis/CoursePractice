package Lessons.Lesson9;

public class AccountBalance {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.printf("%.2f\n",saver1.calculateMonthlyInterest());
        System.out.printf("%.2f\n",saver2.calculateMonthlyInterest());
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("After change 5%");
        System.out.printf("%.2f\n",saver1.calculateMonthlyInterest());
        System.out.printf("%.2f\n",saver2.calculateMonthlyInterest());
    }
}
