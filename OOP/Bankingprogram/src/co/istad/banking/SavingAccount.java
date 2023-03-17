package co.istad.banking;

public class SavingAccount extends Account {
    private Double interest; //កាប្រាក់
    private Interest i;

    public void setI(Interest i) {
        this.i = i;
    }

    public Double getInterest() {
        return interest;
    }
    public void calculateInterest(){
       this.interest= i. calculate(getBalance());
    }

    public void setInterest(Interest i) {
        this.i=i;

    }

    public SavingAccount(Integer accNumber, String name, Double balance) {
        super(accNumber, name, balance);

    }

    public SavingAccount(){
        setInterest(new Interest(){
            @Override
            public double calculate(Double amount) {
                return amount*0.002;
            }
        });

    }

    @Override
    protected void showBalance() {

        System.out.println("==============Welcome===============");
        System.out.println("            | saving account | ");
        System.out.println("======================================");
        System.out.println("    Account n : " + getAccNumber());
        System.out.println("    name : " + getName());
        System.out.println("    balance : "+getBalance()+"$");
        System.out.println("    interest: "+interest);
        System.out.println("======================================");

    }



}
