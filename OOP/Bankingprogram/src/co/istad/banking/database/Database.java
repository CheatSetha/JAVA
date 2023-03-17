package co.istad.banking.database;
import co.istad.banking.CreditAccount;
import co.istad.banking.RielRate;
import co.istad.banking.SavingAccount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    private static CreditAccount creditAccount;
    public static CreditAccount db(){
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setPin(123);
        creditAccount.setName("Setha");
        creditAccount.setAccNumber(168);
        creditAccount.setExpiredDate(LocalDate.now().plus(1,ChronoUnit.DAYS));
        creditAccount.setLimitAmount(1000.0);
        creditAccount.setBalance(1000.0);

        return creditAccount;
    }
    public static SavingAccount savingAccount(){
        SavingAccount savingAccount = new SavingAccount(168,"Setha",1000.0);


        return savingAccount;
    }

}
