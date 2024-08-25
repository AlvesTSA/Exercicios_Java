package util;

public class CurrencyConverter {
    
    public static double calcConverter(double value,double dollar_price){

        return ((value * (6 / 100.0) ) + value) * dollar_price;
    }
}
