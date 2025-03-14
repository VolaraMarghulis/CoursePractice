package Lessons.Lesson7;
import java.util.Scanner;
public class Convertor {
    //TODO 1.Write a program that prompts the user to input a currency code (e.g., USD, EUR, GBP) and a value in USD.
    // The program should convert that value into the corresponding currency. Assume a few conversion rates as follows:
    enum Currency {
        USD(1),
        EUR(0.85), GBP(0.75),
        INR(75.00), AUD(1.35);
        private final double rateToUSD;

        Currency(double rateToUSD) {
            this.rateToUSD = rateToUSD;
        }
        public double getRateToUSD() {
            return rateToUSD;
        }
        // Convert method
        public double convertTo(Currency targetCurrency, double amount) {
            double amountInUSD = amount / this.rateToUSD;
            return amountInUSD * targetCurrency.getRateToUSD();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amountInUSD = sc.nextDouble();
        double amountInEUR = Currency.USD.convertTo(Currency.EUR, amountInUSD);
        double amountInGBP = Currency.USD.convertTo(Currency.GBP, amountInUSD);
        double amountInINR = Currency.USD.convertTo(Currency.INR, amountInUSD);
        double amountInAUD = Currency.USD.convertTo(Currency.AUD, amountInUSD);

        System.out.println(amountInUSD + " USD is " + amountInEUR + " EUR");
        System.out.println(amountInUSD + " USD is " + amountInGBP + " GBP");
        System.out.println(amountInUSD + " USD is " + amountInINR + " INR");
        System.out.println(amountInUSD + " USD is " + amountInAUD + " AUD");
    }
}


