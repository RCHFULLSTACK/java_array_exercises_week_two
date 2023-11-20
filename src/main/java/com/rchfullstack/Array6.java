package com.rchfullstack;

import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.util.Locale;
public class Array6 {
    public void exerSix(){
        int[] numbers = {43, 5, 23, 17, 2, 14};
        float sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        float average = sum / numbers.length;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#0.0", symbols);
        String formattedAverage = decimalFormat.format(average);
        System.out.println("Average is: " + formattedAverage);
    }
}
