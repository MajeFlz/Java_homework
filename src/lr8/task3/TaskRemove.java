package lr8.task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TaskRemove {
    public static void removeTaskByDescription(String description) {
        try {
            FileReader reader = new FileReader("src/lr8/Example6/задачи.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject taskTracker = (JSONObject) jsonParser.parse(reader);
            JSONArray tasks = (JSONArray) taskTracker.get("задачи");

            boolean found = false;
            for (int i = 0; i < tasks.size(); i++) {
                JSONObject task = (JSONObject) tasks.get(i);
                if (task.get("описание").equals(description)) {
                    tasks.remove(i);
                    System.out.println("Задача с описанием \"" + description + "\" успешно удалена.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Задача с описанием \"" + description + "\" не найдена.");
            }

            taskTracker.put("задачи", tasks);
            try (FileWriter file = new FileWriter("src/lr8/Example6/задачи.json")) {
                file.write(taskTracker.toJSONString());
                file.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите описание задачи, которую хотите удалить:");
        String description = scanner.nextLine();

        TaskRemove.removeTaskByDescription(description);
    }
}
