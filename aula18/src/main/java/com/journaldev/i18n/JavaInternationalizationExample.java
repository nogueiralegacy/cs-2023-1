package com.journaldev.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class JavaInternationalizationExample {

    public static void main(String[] args) {
        ResourceBundle bundleAL = ResourceBundle.getBundle("AL");
        ResourceBundle bundleAU = ResourceBundle.getBundle("AU");
        ResourceBundle bundleBR = ResourceBundle.getBundle("BR");
        ResourceBundle bundleCN = ResourceBundle.getBundle("CN");
        ResourceBundle bundleFR = ResourceBundle.getBundle("FR");
        ResourceBundle bundleIN = ResourceBundle.getBundle("IN");
        ResourceBundle bundleJP = ResourceBundle.getBundle("JP");
        ResourceBundle bundleRU = ResourceBundle.getBundle("RU");
        ResourceBundle bundleUK = ResourceBundle.getBundle("UK");
        ResourceBundle bundleUS = ResourceBundle.getBundle("US");

        printMessages(bundleAL);
        printMessages(bundleAU);
        printMessages(bundleBR);
        printMessages(bundleCN);
        printMessages(bundleFR);
        printMessages(bundleIN);
        printMessages(bundleJP);
        printMessages(bundleRU);
        printMessages(bundleUK);
        printMessages(bundleUS);
    }

    private static void printMessages(ResourceBundle bundle) {
        System.out.println(bundle.getString("CountryName"));
        System.out.println(bundle.getString("CountryLanguage"));
        System.out.println(bundle.getString("DateFormat"));
        System.out.println(bundle.getString("LongDateFormat"));
        System.out.println(bundle.getString("TimeFormat"));
        System.out.println(bundle.getString("CurrencyCode"));
        System.out.println(bundle.getString("DecimalSeparator"));
        System.out.println(bundle.getString("ThousandSeparator"));
        System.out.println(bundle.getString("WindowsPageCode"));
    }
}
