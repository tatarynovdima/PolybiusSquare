package org.example;


// Добивить чтение текста с консоли
// Записывать стартовое слово
// Записывать Encryption - append
// Записывать Description - append

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Encryption enc = new Encryption("Дима");
        System.out.println("Encryption : " + enc.getEncryptionText());

        Description desc = new Description(enc.getEncryptionText());
        System.out.println("Description : " + desc.getDescriptionText());
    }
}