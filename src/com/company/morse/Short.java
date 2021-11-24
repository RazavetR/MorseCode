package com.company.morse;

public class Short extends MorseSymbol {
    private static Short instanceShort;

    public Short() {
        setValue(". ");
    }

    public static Short getInstance() {
        if (instanceShort == null)
            instanceShort = new Short();
        return instanceShort;
    }
}
