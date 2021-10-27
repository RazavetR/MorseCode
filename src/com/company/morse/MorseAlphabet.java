package com.company.morse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MorseAlphabet {
    private HashMap<String, List<MorseSymbol>> alphabet;

    public MorseAlphabet() {

    }

    public List<MorseSymbol> getMorseTranslation(String input) {
        List<MorseSymbol> translation = new ArrayList<MorseSymbol>();
        for (char character : input.toCharArray()) {
            translation.addAll(getMorseFromChar(String.valueOf(character)));
        }

        return translation;
    }

    private List<MorseSymbol> getMorseFromChar(String charToTranslate) {
        return alphabet.get(charToTranslate);
    }
}
