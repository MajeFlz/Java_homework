package lr7.Task2;

import java.io.*;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя данных для записи в файл
        System.out.print("Введите данные для записи в файл: ");
        String data = scanner.nextLine();

        // Указание имени файла
        String fileName = "example_file.txt";

        // Запись данных в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println(STR."Данные записаны в файл: \{fileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при записи в файл: \{e.getMessage()}");
        }

        // Чтение данных из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println(STR."Прочитанные данные: \{readData}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при чтении файла: \{e.getMessage()}");
        }

        // Удаление файла
        if (new File(fileName).delete()) {
            System.out.println(STR."Файл удален: \{fileName}");
        } else {
            System.out.println(STR."Не удалось удалить файл: \{fileName}");
        }

        scanner.close();
    }
}
