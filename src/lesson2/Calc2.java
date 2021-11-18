package lesson2;

public class Calc2 {

    public int sumDouble(int dodanok1, int dodanok2) {
        int tempResult = (dodanok1 + dodanok2) * 2;
        System.out.println("Double sum = " + tempResult);
        return tempResult;
    }

    public String sumDouble(int dodanok1, String dodanok2) {
        String tempResult = dodanok1 + dodanok1 + dodanok2 + dodanok2;
        System.out.println("Double sum = " + tempResult);
        return tempResult;
    }

    /**
     * ("11" + 5 )*2= 32
     *
     * @param dodanok1
     * @param dodanok2
     * @return
     */
    public Integer sumDouble(String dodanok1, int dodanok2) {
        try {
            Integer tempResult = (Integer.parseInt(dodanok1) + dodanok2) * 2;
            System.out.println("Double sum = " + tempResult);
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.println("Error 1 : " + e.getMessage());
            return 999;
        } catch (Exception e) {
            System.out.println("Error 2 : " + e);
            return 888;
        } finally {
            System.out.println("Finally ");
        }
    }

}
