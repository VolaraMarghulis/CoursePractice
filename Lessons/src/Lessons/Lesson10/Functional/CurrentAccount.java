package Lessons.Lesson10.Functional;
import Lessons.Lesson10.Abstraction.WithdrawMoney;

public class CurrentAccount extends BankAccount implements WithdrawMoney {
    public CurrentAccount(String holderName, double currentSold){
        super(holderName,currentSold);
    }
    @Override
    public void withdrawMoney(double drawMoney) {
        if (getCurrentSold() - drawMoney <= 50) System.out.println("Transaction failed.......");
        else setCurrentSold(getCurrentSold() - drawMoney);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
