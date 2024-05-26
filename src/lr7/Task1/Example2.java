package lr7.Task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        // Запись данных в файл
        String fileName = "src/lr8/example2/example_file.txt";
        String data = "Это данные для записи в файл";
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(data.getBytes());
            System.out.println(STR."Данные записаны в файл: \{fileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при записи в файл: \{e.getMessage()}");
        }

        // Чтение данных из файла
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, -0, bytesRead);
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