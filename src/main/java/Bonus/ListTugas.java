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
import java.util.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;

public class ListTugas {

    public static void main(String[] args) {
        try {
            Path path = Paths.get(System.getProperty("user.dir"), "data", "tugas.txt");
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }

            try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                Scanner s = new Scanner(System.in);
                System.out.print("Masukkan Tugas: ");
                String data = s.nextLine();
                bw.write(data);
                bw.newLine();
            }

            System.out.println("Tugas berhasil disimpan\n");

        } catch (Exception e) {
            System.err.println("Tugas tidak berhasil disimpan: " + e.getMessage());
            e.printStackTrace();
        }
    }
}