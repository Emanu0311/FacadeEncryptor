package com.example.client;

import com.example.facade.Facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = Facade.getInstance();

        String filePath = "test.txt";
        String originalContent = "¡Hola, patrón Facade en Java!";

        System.out.println("Contenido original: " + originalContent);

        facade.writeEncryptedFile(filePath, originalContent);

        String decryptedContent = facade.readDecryptedFile(filePath);
        System.out.println("Contenido leído y descifrado: " + decryptedContent);
    }
}
