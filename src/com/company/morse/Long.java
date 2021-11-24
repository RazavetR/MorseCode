package com.company.morse;

public class Long extends MorseSymbol{
    private static Long instanceLong;
    public Long() {
        setValue("_ ");
    }

    public static Long getInstance() {
        if (instanceLong == null)
            instanceLong = new Long();
        return instanceLong;
    }
}
