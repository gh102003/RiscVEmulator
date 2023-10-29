package com.pyesmeadow.george;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("RISC-V Emulator");

        System.out.print("Enter a file path for the binary file: ");
        Scanner consoleReader = new Scanner(System.in);
        String filepath = consoleReader.nextLine();

        IMemoryProvider memoryProvider = new FileMemoryProvider(filepath);

        Hart h = new Hart(memoryProvider);
        h.x[4] = 3;

        System.out.println(Arrays.toString(h.memory));
        System.out.println(Arrays.toString(h.x));

        h.step();

        System.out.println(Arrays.toString(h.memory));
        System.out.println(Arrays.toString(h.x));
    }
}