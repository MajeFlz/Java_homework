package lr7.Task1;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        // Создание папки
        File folder = new File("src/lr7/Task1/example_folder");
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println(STR."Папка создана: \{folder.getAbsolutePath()}");
            } else {
                System.out.println(STR."Не удалось создать папку: \{folder.getAbsolutePath()}");
            }
        } else {
            System.out.println(STR."Папка уже существует: \{folder.getAbsolutePath()}");
        }

        // Создание файла внутри папки
        File file = new File(STR."\{folder.getAbsolutePath()}\{File.separator}example_file.txt");

        try {
            if (file.createNewFile()) {
                System.out.println(STR."Файл создан: \{file.getAbsolutePath()}");
            } else {
                System.out.println(STR."Не удалось создать файл: \{file.getAbsolutePath()}");
            }
        } catch (IOException e) {
            System.out.println(STR."Ошибка при создании файла: \{e.getMessage()}");
        }

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