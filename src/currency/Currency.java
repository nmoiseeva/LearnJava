package currency;

import java.text.DecimalFormat;

abstract class Currency {
    private double kursNBU;
    private double marga = 1.1;
    DecimalFormat df = new DecimalFormat("####0.00");
    DecimalFormat dfKurs = new DecimalFormat("####0.0000");

//    private double kursBuy = kursNBU * marga;
//    private double kursSell = kursNBU / marga;

    public Currency(double kursNBU){

        this.kursNBU = kursNBU;
        if (!(this instanceof IsFreeConverted)) {
            marga = marga*1.2;
            System.out.println("This is NOT real Currency!! So marga is changed. Current marga = " + df.format(marga));
        }
        else {
            if(!((IsFreeConverted) this).isFreeConv()){
                marga = marga*1.1;
                System.out.println("This is NOT free converted currency!! So marga is changed. Current marga = " + df.format(marga));
            }
        }
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
        if (!(this instanceof IsFreeConverted)) {
            marga = marga*1.2;
            System.out.println("This is NOT real Currency!! So marga is changed. Current marga = " + df.format(marga));
        }
        else {
            if(!((IsFreeConverted) this).isFreeConv()){
                marga = marga*1.1;
                System.out.println("This is NOT free converted currency!! So marga is changed. Current marga = " + df.format(marga));
            }
        }
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
        System.out.println(String.format("For %s Grn you get %s %s by kurs %s (marga %s)", numberOfGrn,
                df.format(tempResult), getCurrencyName(), dfKurs.format(getKursBuy()),  df.format(getMarga())));
        return tempResult;
    }

    public double exchangeCurrencyToGrn(double numberOfCurrency){
        double tempResult = numberOfCurrency * getKursSell();
        System.out.println(String.format("For %s %s you get %s Grn by kurs %s (marga %s)", numberOfCurrency,
                getCurrencyName(), df.format(tempResult), dfKurs.format(getKursSell()), df.format(getMarga())));
        return tempResult;
    }

}
