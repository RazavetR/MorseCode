package com.company.morse;

public class Space extends MorseSymbol {
    private static final Space instanceSpace = new Space();

    public Space() {
        setValue("  ");
    }

    public static Space getInstance() {
        return instanceSpace;
    }
}
