package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;

public abstract class Account {
    private Integer accNumber;
    private String name;
    private Double balance;

    public Integer getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }


   public void setBalance(Double balance) {
        this.balance =balance;
    }

    protected void deposit(Double amount) {
        System.out.println("deposite");
        if (amount < 0) {
            System.out.println("Kidding me??");
            return;
        }
        if (amount == 0) {
            System.out.println("yoh bro you can't deposit bro!");
            return;
        }
        balance += amount;
    }
    protected void withdrawal(Double amount) {
        System.out.println("Withdraw");
        if (amount < 0) {
            System.out.println("Kidding me??");
            return;
        }
        if (amount > balance) {
            System.out.println("bro you don't have enough money bro!");
            return;
        }

        balance -= amount;
    }
    protected abstract void showBalance() ;

    public Account(Integer accNumber, String name, Double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }
    public Account(){

    }
}

