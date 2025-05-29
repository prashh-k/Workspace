package com.IO_Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamsExample {
    public static void writeAndReadFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Content written to file!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (FileReader reader = new FileReader(filePath)) {
            int charData;
            System.out.println("Reading content from file:");
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        writeAndReadFile("C:\\Java_Codes\\8. IO Streams\\example.txt", "Hello, world!");
    }
}