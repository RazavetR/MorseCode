package com.company.morse;

public class Long extends MorseSymbol{
    private static final Long instanceLong = new Long();
    private Long() {
        setValue("___ ");
    }

    public static Long getInstance() {
        return instanceLong;
    }
}
