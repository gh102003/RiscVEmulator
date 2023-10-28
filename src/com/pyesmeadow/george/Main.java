package com.pyesmeadow.george;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("RISC-V Emulator");

        System.out.print("Enter a file path for the binary file: ");
        Scanner consoleReader = new Scanner(System.in);
        String filepath = consoleReader.nextLine();

        File instructionsFile = new File(filepath);
        try (FileInputStream instructionsStream = new FileInputStream(instructionsFile)) {
            byte[] instructionBytes = instructionsStream.readNBytes(4);
            int instruction = ByteBuffer.wrap(instructionBytes).getInt();
            executeInstruction(instruction);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void executeInstruction(int instruction) {
        System.out.printf("Executing com.pyesmeadow.george.instruction %d\n", instruction);
    }
}