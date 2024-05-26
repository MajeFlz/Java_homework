package lr7.Task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя данных для записи в входной файл
        System.out.print("Введите данные для записи в входной файл: ");
        String data = scanner.nextLine();

        String inputFileName = "src/lr8/example5/input.txt";
        String outputFileName = "src/lr8/example5/output.txt";

        // Запись данных в входной файл
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(inputFileName), StandardCharsets.UTF_8))) {
            bufferedWriter.write(data);
            System.out.println(STR."Данные записаны в входной файл: \{inputFileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при записи в входной файл: \{e.getMessage()}");
        }

        // Чтение данных из входного файла, преобразование и запись в выходной файл
        try (InputStream inputStream = new FileInputStream(inputFileName);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             OutputStream outputStream = new FileOutputStream(outputFileName);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            System.out.println(STR."Данные записаны в выходной файл: \{outputFileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при чтении/записи файла: \{e.getMessage()}");
        }

        scanner.close();
    }
}
