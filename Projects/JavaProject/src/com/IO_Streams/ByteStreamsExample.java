package com.IO_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamsExample {
    public static void copyFileUsingByteStream(String sourceFile, String destFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        copyFileUsingByteStream("C:\\Java_Codes\\8. IO Streams\\text1.txt", "C:\\Java_Codes\\8. IO Streams\\destination.txt"); 
    }
}

