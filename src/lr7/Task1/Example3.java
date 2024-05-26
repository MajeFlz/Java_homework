package lr7.Task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        // Запись данных в файл
        String fileName = "src/lr8/example3/example_file.txt";
        String data = "Это данные для записи в файл";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println(STR."Данные записаны в файл: \{fileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при записи в файл: \{e.getMessage()}");
        }

        // Чтение данных из файла
        try (FileReader reader = new FileReader(fileName)) {
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
    }
}