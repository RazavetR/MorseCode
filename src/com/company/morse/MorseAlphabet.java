package com.company.morse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MorseAlphabet {
    private HashMap<String, List<MorseSymbol>> alphabet;

    public MorseAlphabet() {
        String[] characters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----"};

        HashMap<String, MorseSymbol> symbolTranslator = new HashMap<>();
        symbolTranslator.put(".", Short.getInstance());
        symbolTranslator.put("-", Long.getInstance());

        List<List<MorseSymbol>> symbols = new ArrayList<>();
        for (String letter : morse) {
            List <MorseSymbol> letterToAdd = new ArrayList<>();
            for (char character : letter.toCharArray()) {
                letterToAdd.add(symbolTranslator.get(String.valueOf(character)));
            }
            symbols.add(letterToAdd);
        }


        alphabet = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            alphabet.put(characters[i], symbols.get(i));
        }
    }


    public List<MorseSymbol> getMorseFromChar(char charToTranslate) throws InvalidASCIIException {
        List<MorseSymbol> result = alphabet.get(String.valueOf(Character.toLowerCase(charToTranslate)));

        if (result == null)
            throw new InvalidASCIIException(charToTranslate);
        return result;
    }
}
