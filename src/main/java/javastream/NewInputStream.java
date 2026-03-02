/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastream;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class NewInputStream {

    public static void main(String[] args) {

        try {
            Path path = Paths.get(System.getProperty("user.dir"), "data", "praktik1.txt");
            if (!Files.exists(path)) {
                System.out.println("File praktik1.txt tidak ditemukan.");
                return;
            }

            try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
            System.err.println("Gagal membaca file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}