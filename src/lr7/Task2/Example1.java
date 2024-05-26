package lr7.Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя пути к папке
        System.out.print("Введите путь к папке: ");
        String folderPath = scanner.nextLine();

        // Создание папки
        File folder = new File(folderPath);
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println(STR."Папка создана: \{folder.getAbsolutePath()}");
            } else {
                System.out.println(STR."Не удалось создать папку: \{folder.getAbsolutePath()}");
            }
        } else {
            System.out.println(STR."Папка уже существует: \{folder.getAbsolutePath()}");
        }

        // Запрос у пользователя имени файла
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        // Создание файла внутри папки
        File file = new File(folder.getAbsolutePath() + File.separator + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println(STR."Файл создан: \{file.getAbsolutePath()}");

                // Запрос у пользователя данных для записи в файл
                System.out.print("Введите данные для записи в файл: ");
                String data = scanner.nextLine();

                // Запись данных в файл
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(data);
                    System.out.println("Данные успешно записаны в файл.");
                } catch (IOException e) {
                    System.out.println(STR."Ошибка при записи в файл: \{e.getMessage()}");
                }
            } else {
                System.out.println(STR."Не удалось создать файл: \{file.getAbsolutePath()}");
            }
        } catch (IOException e) {
            System.out.println(STR."Ошибка при создании файла: \{e.getMessage()}");
        }

        // Закрытие Scanner
        scanner.close();

        // Удаление файла и папки
        if (file.delete()) {
            System.out.println(STR."Файл удален: \{file.getAbsolutePath()}");
        } else {
            System.out.println(STR."Не удалось удалить файл: \{file.getAbsolutePath()}");
        }

        if (folder.delete()) {
            System.out.println(STR."Папка удалена: \{folder.getAbsolutePath()}");
        } else {
            System.out.println(STR."Не удалось удалить папку: \{folder.getAbsolutePath()}");
        }
    }
}
