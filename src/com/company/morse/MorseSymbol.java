package com.company.morse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorseSymbol {
    private String value;

    protected void setValue(String value) {this.value = value; }

    @Override
    public String toString() {
        return value;
    }
}
