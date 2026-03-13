package com.example.subsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public void writeContent(String filePath, String content) {
        try {
            Files.write(Paths.get(filePath), content.getBytes());
            System.out.println("Archivo guardado: " + filePath);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
