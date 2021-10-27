package com.company.morse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorseSymbol {
    private String value;
    private List<Integer> positions;

    public MorseSymbol() {
        positions = new ArrayList<Integer>();
    }

    public void addAtPosition(int position) {
        positions.add(position);
    }

    protected void setValue(String value) {this.value = value; }

    @Override
    public String toString() {
        return value;
    }
}
