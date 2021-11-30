package currency;

public class MenuCurrency extends Menu{
    public static void printCurrencyMenu() {
        System.out.println("");
        System.out.println("Choose currency:");
        System.out.println("1. Dollar");
        System.out.println("2. Euro");
        System.out.println("3. BitCoin");
        System.out.println("100: for Exit");
        System.out.println("Enter your choice:");
    }

    public static Currency setCurrency(int currencyNumber) {
        Currency tempCurrency = null;
        switch (currencyNumber){
            case 1 :
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Dollar");
               // System.out.println("Dollar");
                break;
            case 2 :
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Euro");
              //  System.out.println("Euro");
                break;
            case 3 :
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Bitcoin");
               // System.out.println("Bitcoin");
                break;
            default:
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Dollar");
              //  System.out.println("Default currency: Dollar");
        }
        return tempCurrency;
    }
}
