package co.istad.banking;

public class RielRate implements Interest{
    @Override
    public double calculate(Double amount) {
        return amount*0.09;
    }
}
