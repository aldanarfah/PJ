/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javastream;

import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author aldanarfah
 */
public class JavaStream {

    public static void main(String[] args) {
        try {
            Path path = Paths.get(System.getProperty("user.dir"), "data", "praktik1.txt");
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }

            Scanner s = new Scanner(System.in);
            System.out.println("Masukkan Kalimat:");
            String data = s.nextLine();

            try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                bw.write(data);
                bw.newLine();
            }

            System.out.println("Pengiriman data berhasil");
        } catch (Exception e) {
            System.err.println("Pengiriman data tidak berhasil: " + e.getMessage());
            e.printStackTrace();
        }
}
}
