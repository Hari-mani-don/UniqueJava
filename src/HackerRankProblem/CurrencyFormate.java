package HackerRankProblem;

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
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(indiaLocale);
        symbols.setCurrencySymbol("Rs.");
        String pattern = "##,##,##0.00";
        DecimalFormat indiaCurrencyFormat = new DecimalFormat(pattern,symbols );
        String indiaFormatted = indiaCurrencyFormat.format(num);
        System.out.println("India format: " + indiaFormatted);

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
