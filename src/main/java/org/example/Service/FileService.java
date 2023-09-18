package org.example.Service;

import org.example.Models.Toy;

import java.io.*;

public class FileService implements IFileService{
    private static String filePath = "toy.txt";
    public void writePrize(Toy toy){
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            String json = toy.toJson();
            writer.println(json);
            System.out.println("Объект успешно записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
