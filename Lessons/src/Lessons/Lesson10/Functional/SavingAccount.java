package Lessons.Lesson10.Functional;
import Lessons.Lesson10.Abstraction.WithdrawMoney;
import java.time.LocalDate;

public class SavingAccount extends BankAccount implements WithdrawMoney {
    private static final double rate = 0.03;
    private LocalDate lastTransactionTime;
    private LocalDate accountCreationTime;
    private LocalDate lastWithdrawalDate;

    public SavingAccount(String holderName, double currentSold){
        super(holderName,currentSold);
        this.lastTransactionTime = LocalDate.now();
        this.accountCreationTime = LocalDate.now();
        this.lastWithdrawalDate = null;
    }
    @Override
    public void withdrawMoney(double drawMoney) {
        if (getCurrentSold() < drawMoney) System.out.println("Insufficient amount");
        if (lastWithdrawalDate != null &&
            lastWithdrawalDate.getMonth() ==
            LocalDate.now().getMonth()) System.out.println("More than one withdrawal per month cannot be made.");
        else {
            setCurrentSold(getCurrentSold() - drawMoney);
            this.lastWithdrawalDate = LocalDate.now();
            System.out.println("Update data: " + getLastWithdrawalDate());
        }
    }

    public LocalDate getLastWithdrawalDate() {
        return lastWithdrawalDate;
    }

    public LocalDate getAccountCreationTime() {
        return accountCreationTime;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Account create: %s, Today's date: %s",this.accountCreationTime,LocalDate.now());
    }
}
