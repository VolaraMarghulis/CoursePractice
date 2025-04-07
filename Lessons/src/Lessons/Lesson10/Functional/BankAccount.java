package Lessons.Lesson10.Functional;
import Lessons.Lesson10.Abstraction.Identification;

class BankAccount extends Identification {
  private String holderName;
  private double currentSold;

  BankAccount(String holderName, double currentSold){
      this.holderName = holderName;
      this.currentSold = currentSold;
  }

    public String getUniqueID() {
        return uniqueID.getUniqueCode();
      }
    public double getCurrentSold() {
          return currentSold;
      }
    public void setCurrentSold(double currentSold) {
        this.currentSold = currentSold;
    }
    public String getHolderName() {
          return holderName;
      }
    protected void deposit(double amount){
      this.currentSold += amount;
  }

    @Override
    public String toString() {
        return String.format("Name : %s, CardNumber: %s, sold available [ %.2f RON ]",this.holderName,getUniqueID(),this.currentSold);
    }
}
