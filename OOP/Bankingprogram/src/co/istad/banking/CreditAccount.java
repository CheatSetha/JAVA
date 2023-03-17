package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;
import java.util.Objects;

public class CreditAccount extends Account {
    private Integer pin;
    private Double limitAmount;
    private LocalDate expiredDate;

    public CreditAccount(Integer accNumber, String name, Double balance) {
        super(accNumber, name, balance);
    }

    public CreditAccount() {
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }


    @Override
    protected void deposit(Double amount) {

        if (expiredDate.isAfter(Database.db().getExpiredDate())){
            System.out.println("card expired");
        }
        super.deposit(amount);
    }

    @Override
    protected void withdrawal(Double amount) {

        if (amount > limitAmount) {
            System.out.println("out of limit amount");
            return;
        }
        if (expiredDate.isAfter(Database.db().getExpiredDate())) {
            System.out.println("card expired");
        }
        super.withdrawal(amount);
    }

    @Override
    protected void showBalance() {

            System.out.println("==============Welcome===============");
            System.out.println("           | Credit Card | ");
            System.out.println("====================================");
            System.out.println("    Account n : " + getAccNumber());
            System.out.println("    name : " + getName());
            System.out.println("    balance : "+getBalance()+"$");
            System.out.println("    Pin : " + pin);
            System.out.println("    expired date : " + expiredDate);
            System.out.println("    limit amount : " + limitAmount + "$");
            System.out.println("======================================");

    }
}
