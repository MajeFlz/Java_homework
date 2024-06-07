package lr8.task3;

import java.io.FileReader;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TaskSearch {
    public static void findTaskByDescription(String description) {
        try {
            FileReader reader = new FileReader("src/lr8/Example6/задачи.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject taskTracker = (JSONObject) jsonParser.parse(reader);
            JSONArray tasks = (JSONArray) taskTracker.get("задачи");

            for (int i = 0; i < tasks.size(); i++) {
                JSONObject task = (JSONObject) tasks.get(i);
                if (task.get("описание").equals(description)) {
                    System.out.println("Задача найдена:");
                    System.out.println("Описание: " + task.get("описание"));
                    System.out.println("Срок: " + task.get("срок"));
                    System.out.println("Приоритет: " + task.get("приоритет"));
                    return;
                }
            }

            System.out.println("Задача с описанием \"" + description + "\" не найдена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите описание задачи, которую хотите найти: ");
        String description = scanner.nextLine();

        TaskSearch.findTaskByDescription(description);
    }
}
