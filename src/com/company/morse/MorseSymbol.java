package com.company.morse;

public class MorseSymbol {
    private String value;

    protected void setValue(String value) {this.value = value; }

    @Override
    public String toString() {
        return value;
    }
}
