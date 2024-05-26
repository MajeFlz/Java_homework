package lr7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {

        String sourceFile = "C:\\Users\\deout\\Desktop\\Java\\Java_Белоус_ЛР7.txt";
        String destinationFile = "C:\\Users\\deout\\Desktop\\Java\\Java_Белоус_ЛР8.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            System.out.println(STR."Произошла ошибка при копировании файла: \{e.getMessage()}");
        }
    }
}
