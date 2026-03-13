package com.example.facade;

import com.example.subsystem.FileEncryptor;
import com.example.subsystem.FileReader;
import com.example.subsystem.FileWriter;

public class Facade {
    private static Facade instance;
    private final FileReader reader;
    private final FileWriter writer;
    private final FileEncryptor encryptor;

    private Facade() {
        this.reader = new FileReader();
        this.writer = new FileWriter();
        this.encryptor = new FileEncryptor();
    }

    public static Facade getInstance() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public void writeEncryptedFile(String filePath, String content) {
        String encrypted = encryptor.encrypt(content);
        writer.writeContent(filePath, encrypted);
    }

    public String readDecryptedFile(String filePath) {
        String content = reader.readContent(filePath);
        return encryptor.decrypt(content);
    }
}
