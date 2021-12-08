package com.company.controller;

import com.company.morse.Morse;
import com.company.morse.MorseSymbol;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Morse morse = new Morse();

        Scanner input = new Scanner(System.in);
        String toTranslate;
        do {
            System.out.println("\nPlease enter a sentence to be translated (or 'q' to quit the program):");
            toTranslate = input.nextLine();

            for (MorseSymbol symbol : morse.translate(toTranslate))
                System.out.print(symbol);

        } while (!toTranslate.equals("q"));
    }
}
