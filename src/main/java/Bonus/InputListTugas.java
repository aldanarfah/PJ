/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bonus;

/**
 *
 * @author aldanarfah
 */
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class InputListTugas {

    public static void main(String[] args) {

        try {
            Path path = Paths.get(System.getProperty("user.dir"), "data", "tugas.txt");
            if (!Files.exists(path)) {
                System.out.println("Belum ada data tugas.");
                return;
            }

            System.out.println("=== DAFTAR TUGAS ===");

            try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
            System.out.println("Belum ada data tugas atau terjadi kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
    }
}