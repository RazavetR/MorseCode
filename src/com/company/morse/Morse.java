package com.company.morse;

import java.util.ArrayList;
import java.util.List;

public class Morse {
    MorseAlphabet morseAlphabet;
    private List<MorseSymbol> translation;

    public Morse() {
        translation = new ArrayList<>();
        morseAlphabet = new MorseAlphabet();
    }

    public List<MorseSymbol> translate(String toTranslate) {
        for (String wordToTranslate : toTranslate.split(" ")) {
            translation.addAll(translateWord(wordToTranslate));
        }

        return translation;
    }

    public List<MorseSymbol> translateWord(String word) {
        List<MorseSymbol> listTemp = new ArrayList<MorseSymbol>();
        for(int cpt =0; cpt< word.length();cpt++){
            listTemp.addAll(translateChar(word.toCharArray()[cpt]));
            //separation entre les mots: 7 points:abc
        }
        listTemp.add(Space.getInstance());
        listTemp.add(Space.getInstance());
        return listTemp;
    }

    public List<MorseSymbol> translateChar(char character) {

        List<MorseSymbol>  charList = new ArrayList<MorseSymbol>();
        charList.addAll(morseAlphabet.getMorseFromChar(character));

        //separation entre les lettres: 3 points = 1 "-":
        charList.add(Space.getInstance());
        return charList;


    }
}
