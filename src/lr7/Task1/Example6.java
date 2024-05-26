package lr7.Task1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example6 {
    public static void main(String[] args) {
        String inputFileName = "src/lr8/example6/input.txt";
        String outputFileName = "src/lr8/example6/output.txt";
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter =
                     new PrintWriter(new OutputStreamWriter(
                             new FileOutputStream(outputFileName), StandardCharsets.UTF_8))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println(STR."Данные записаны в файл: \{outputFileName}");
        } catch (IOException e) {
            System.out.println(STR."Ошибка при чтении/записи файла: \{e.getMessage()}");
        }
    }
}
