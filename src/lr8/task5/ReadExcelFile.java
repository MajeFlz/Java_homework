package lr8.task5;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        String filePath = "src/lr8/Example8/file.xlsx";
        try (FileInputStream inputStream = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
            XSSFSheet sheet = workbook.getSheet("Товары");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.printf("%s\t", cell);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Файл не найден: %s\n", e.getMessage());
        } catch (IOException e) {
            System.out.printf("Не удалось прочитать из файла: %s\n", e.getMessage());
        }
    }
}
