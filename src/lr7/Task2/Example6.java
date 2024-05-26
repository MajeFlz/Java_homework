package lr7.Task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя данных для записи в входной файл
        System.out.print("Введите данные для записи в входной файл: ");
        String data = scanner.nextLine();

        String inputFileName = "src/lr8/example6/input.txt";
        String outputFileName = "src/lr8/example6/output.txt";

        // Запись данных в входной файл
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(inputFileName), StandardCharsets.UTF_8))) {
            bufferedWriter.write(data);
            System.out.println(STR."Данные записаны в входной файл: \{inputFileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при записи в входной файл: \{e.getMessage()}");
        }

        // Чтение данных из входного файла, преобразование и запись в выходной файл
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
             PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(
                     new FileOutputStream(outputFileName), StandardCharsets.UTF_8))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println(STR."Данные записаны в выходной файл: \{outputFileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при чтении/записи файла: \{e.getMessage()}");
        }

        scanner.close();
    }
}
