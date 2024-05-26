package lr7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите текст для записи в файл: ");
        String textToWrite = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(textToWrite);
            System.out.println(STR."Записано символов: \{textToWrite.length()}");
        } catch (IOException e) {
            System.out.println(STR."Произошла ошибка при записи в файл: \{e.getMessage()}");
        } finally {
            scanner.close();
        }
    }
}
