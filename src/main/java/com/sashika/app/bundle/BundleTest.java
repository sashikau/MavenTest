package com.sashika.app.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class BundleTest {

    public static void main(String[] args) {

        System.out.println("Current Locale: " + Locale.getDefault());
        ResourceBundle mybundle = ResourceBundle.getBundle("MyLabels");

        // read MyLabels_en_US.properties
        System.out.println("Say how are you in US English: " + mybundle.getString("how_are_you"));

        Locale.setDefault(new Locale("sv", "SE"));

        // read MyLabels_ms_MY.properties
        System.out.println("Current Locale: " + Locale.getDefault());
        mybundle = ResourceBundle.getBundle("MyLabels");
        System.out.println("Say how are you in Malaysian Malaya language: " + mybundle.getString("how_are_you"));
    }
}
