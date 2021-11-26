package currency;

abstract class Currency {
    private double kursNBU;
    private double marga = 1.1;
//    private double kursBuy = kursNBU * marga;
//    private double kursSell = kursNBU / marga;

    public Currency(double kursNBU){
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getKursBuy() {
        return kursNBU * marga;
    }

    public double getKursSell() {
        return kursNBU / marga;
    }

    abstract String getCurrencyName();

    public double exchangeGrnToCurrency(double numberOfGrn){
        double tempResult = numberOfGrn / getKursBuy();
        System.out.println(String.format("For %s Grn you get %s %s by kurs %s",
                numberOfGrn, tempResult, getCurrencyName(), getKursBuy()));
        return tempResult;
    }

    public double exchangeCurrencyToGrn(double numberOfCurrency){
        double tempResult = numberOfCurrency * getKursSell();
        System.out.println(String.format("For %s %s you get %s Grn by kurs %s",
                numberOfCurrency, getCurrencyName(), tempResult, getKursSell()));
        return tempResult;
    }

}
