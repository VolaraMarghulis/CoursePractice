package Lessons.Lesson10;

import Lessons.Lesson10.Functional.CurrentAccount;
import Lessons.Lesson10.Functional.SavingAccount;

public class Main {
    public static void main(String[] args) {

        CurrentAccount person1 = new CurrentAccount("John",2000);
        SavingAccount person2 = new SavingAccount("John",1500);
        System.out.println(person1.toString());
        person1.withdrawMoney(1500);
        System.out.println(person1.toString());
        person1.withdrawMoney(460);
        System.out.println(person1.toString());

        System.out.println(person2);



    }
}
