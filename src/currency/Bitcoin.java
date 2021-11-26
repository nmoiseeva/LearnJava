package currency;

public class Bitcoin extends Currency implements CryptoCurrency{
    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public boolean isCryptoCurrency() {
        return true;
    }

    @Override
    public double exchangeGrnToCurrency(double numberOfGrn){
        System.out.println(String.format("Operation with currency %s not allow by NBU", getCurrencyName()));
        return numberOfGrn;
    }
}
