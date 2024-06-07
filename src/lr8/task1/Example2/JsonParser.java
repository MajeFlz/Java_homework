package lr8.task1.Example2;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr8/Example2/example.json"));
            JSONObject jsonObject = (JSONObject) obj;

            String root = jsonObject.keySet().iterator().next().toString();
            System.out.printf("Корневой элемент: %s\n", root);

            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.printf("Название книги: %s\n", book.get("title"));
                System.out.printf("Автор: %s\n", book.get("author"));
                System.out.printf("Год издания: %s\n", book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
