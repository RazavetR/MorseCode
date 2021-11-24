package com.company.morse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MorseAlphabet {
    private HashMap<String, String> alphabet;

    public MorseAlphabet() {
        String[] characters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----"};

        alphabet = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            alphabet.put(characters[i], morse[i]);
        }
    }

    private String getMorseFromChar(String charToTranslate) {
        return alphabet.get(charToTranslate);
    }
}
