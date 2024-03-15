import java.text.DecimalFormat;

public class MoneyUtil {

    public static String format(double money){
        return (String.format("%.2f$", money));
    }

    public static String format(double money, String symbol){

        if(symbol == null){
            throw new IllegalArgumentException();
        }
        return (String.format("%.2f"+symbol, money));
    }
}
