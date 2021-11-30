package currency;

public class CurrencyExchаnge {
    public static void main(String[] args) {
        Currency workingCurrency;
        Dollar dollar = new Dollar(26);
        Euro euro = new Euro(32);
        ListOfCurrency.addCurrency(dollar);
        ListOfCurrency.addCurrency(euro);
        ListOfCurrency.addCurrency(new Bitcoin(15000));

        final int EXIT_NUMBER = 100;
        int currencyNumber;

        do {
            MenuCurrency.printCurrencyMenu();
            currencyNumber = MenuCurrency.getNumberFromConsole();

            if (currencyNumber ==0){
                System.out.println("Wrong currency. Try again!");
                continue;
            }else if(currencyNumber != EXIT_NUMBER){
   //             System.out.println(currencyNumber);
                workingCurrency = MenuCurrency.setCurrency(currencyNumber);
                System.out.println(workingCurrency.getCurrencyName()+ " " + workingCurrency.getKursNBU());
            }

        } while (currencyNumber != EXIT_NUMBER);
    }
}
