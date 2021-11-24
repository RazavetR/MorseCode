package com.company.morse;

public class Space extends MorseSymbol {
    private static Space instanceSpace;

    public Space() {
        setValue("  ");
    }

    public static Space getInstance() {
        if (instanceSpace == null)
            instanceSpace = new Space();
        return instanceSpace;
    }
}
