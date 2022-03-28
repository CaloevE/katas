package katas.kata6level;

/**
 * Created by Evghenii.
 * 11-January-2022
 */
public class KataPhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String format = "(xxx) xxx-xxx";

        for (int i = 0; i< numbers.length; i++){
            format = numbers.toString().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        }
        return format;
    }
}
