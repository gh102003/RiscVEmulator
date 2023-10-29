package com.pyesmeadow.george;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileMemoryProvider implements IMemoryProvider {

    private final String filepath;
    public FileMemoryProvider(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public byte[] getMemory() {
        byte[] memory;
        File instructionsFile = new File(filepath);
        try (FileInputStream instructionsStream = new FileInputStream(instructionsFile)) {
            memory = instructionsStream.readAllBytes();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return memory;
    }
}
