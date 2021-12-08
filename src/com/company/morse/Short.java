package com.company.morse;

public class Short extends MorseSymbol {
    private static Short instanceShort;

    private Short() {
        setValue(". ");
    }

    public static Short getInstance() {
        // TODO: Instancier le symbole au début de l'execution, ou au premier appel ?
        if (instanceShort == null)
            instanceShort = new Short();
        return instanceShort;
    }
}
