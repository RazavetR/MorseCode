package com.company.morse;

public class Morse {
    private Short shorts;
    private Long longs;

    public Morse() {
        shorts = new Short();
        longs = new Long();
    }

    public String translate(String toTranslate) {
        for (char charToTranslate : toTranslate.toCharArray()) {
            translateChar(charToTranslate);
        }
        return "";
    }

    public void translateChar(char character) {

    }
}
