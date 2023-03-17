package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;
import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setPin(123);
        creditAccount.setAccNumber(168);

        creditAccount.setExpiredDate(LocalDate.now());
//        check account number whether equal to db or not
        if (Database.db().getAccNumber().equals(creditAccount.getAccNumber())){
            creditAccount = Database.db();

        }
//        check if wrong account number
        if (!Database.db().getAccNumber().equals(creditAccount.getAccNumber())){
            System.out.println("invalid account number");
            return;
        }

        creditAccount.showBalance();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the amount you want to deposit : ");
//        Double inputAmount =scanner.nextDouble();
        creditAccount.deposit(500.0);
        creditAccount.showBalance();
        creditAccount.withdrawal(900.0);
       // creditAccount.showBalance();

        SavingAccount savingAccount = new SavingAccount();


        SavingAccount savingAccount2 = new SavingAccount();

        savingAccount.setI(new RielRate());
        savingAccount2.setI(new UsdRate());
        savingAccount.showBalance();
        savingAccount2.showBalance();

        SavingAccount mySavingAcc = new SavingAccount();
        mySavingAcc.setI(new UsdRate());
        mySavingAcc.calculateInterest();
        System.out.println("the interest is : "+mySavingAcc.getInterest());
    }
}
