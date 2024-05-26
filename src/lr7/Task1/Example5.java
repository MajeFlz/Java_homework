package lr7.Task1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example5 {
    public static void main(String[] args) {
        String inputFileName = "src/lr8/example5/input.txt";
        String outputFileName = "src/lr8/example5/output.txt";
        try (InputStream inputStream = new FileInputStream(inputFileName);
             InputStreamReader inputStreamReader =
                     new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader bufferedReader =
                     new BufferedReader(inputStreamReader);
             OutputStream outputStream = new FileOutputStream(outputFileName);
             OutputStreamWriter outputStreamWriter =
                     new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter =
                     new BufferedWriter(outputStreamWriter)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            System.out.println(STR."Данные записаны в файл: \{outputFileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при чтении/записи файла: \{e.getMessage()}");
        }
    }
}