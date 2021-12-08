package com.company.morse;

public class InvalidASCIIException extends Exception {
    char invalidCharacter;

    public InvalidASCIIException(char invalidCharacter) {
        this.invalidCharacter = invalidCharacter;
    }

    @Override
    public String toString() {
        return "InvalidASCIIException - L'utilisateur a rentré un caractère ASCII invalide: {" +
                "invalidCharacter= " + invalidCharacter +
                '}';
    }
}
