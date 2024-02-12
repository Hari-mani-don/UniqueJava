package HackerRankProblem;

import javax.sound.sampled.FloatControl;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormate {

    public static void main(String[] args) {
        double num = 12345.67d;

        // Locale for India
        Locale indiaLocale = new Locale("en", "IN");

        // Create a custom currency format for India
        Locale india = new Locale("en", "IN");
        NumberFormat n = NumberFormat.getCurrencyInstance(india);
        String indiaCurrency= n.format(n);
        System.out.println("India format: " + indiaCurrency);

        Locale locales = Locale.US;
        NumberFormat us = NumberFormat.getCurrencyInstance(locales);
        String usFormats=us.format(num);
        System.out.println(usFormats);

        Locale localChina = Locale.CHINA;
        NumberFormat china = NumberFormat.getCurrencyInstance(localChina);
        String ChinaFormate=china.format(num);
        System.out.println(ChinaFormate);

        Locale localFrance = new Locale("fr", "FR");
        NumberFormat France = NumberFormat.getCurrencyInstance(localFrance);
        String FranceFormate=France.format(num);
        System.out.println(FranceFormate);


    }
}
