package lr7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    System.out.println(STR."Строка \{lineNumber}: \{line}");
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println(STR."Произошла ошибка при чтении файла: \{e.getMessage()}");
        } finally {
            scanner.close();
        }
    }
}

