package co.istad.banking;

public class UsdRate implements Interest{
    @Override
    public double calculate(Double amount) {
        return amount*0.06;
    }
}
