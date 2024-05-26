package lr7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\deout\\Desktop\\Java\\Java_Белоус_ЛР7.docx";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println(STR."Количество строк в файле: \{lineCount}");
        } catch (IOException e) {
            System.out.println(STR."Произошла ошибка при чтении файла: \{e.getMessage()}");
        }
    }
}
