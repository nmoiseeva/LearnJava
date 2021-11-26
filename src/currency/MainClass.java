package currency;

public class MainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(26);
        System.out.println(dollar.getKursNBU());
        System.out.println(dollar.getMarga());

        dollar.setKursNBU(26.4);
        System.out.println(dollar.getKursNBU());

        dollar.exchangeGrnToCurrency(1000);
        dollar.exchangeCurrencyToGrn(100);

        Euro euro = new Euro(32);
        euro.exchangeCurrencyToGrn(1000);
        euro.exchangeGrnToCurrency(1000);
        System.out.println(euro.isFreeConv());

        Som som = new Som(0.0001);
        som.setMarga(1.3);
        som.exchangeCurrencyToGrn(100000);
        som.exchangeGrnToCurrency(1000);
        som.setKursNBU(11111);
        som.exchangeCurrencyToGrn(100000);
        System.out.println();

        Bitcoin bitcoin = new Bitcoin(50000);
        bitcoin.exchangeCurrencyToGrn(15);
        bitcoin.exchangeGrnToCurrency(10000);
        System.out.println(bitcoin.isCryptoCurrency());
    }
}
