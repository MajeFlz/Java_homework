package lr8.task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TaskAdd {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr8/Example6/задачи.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("задачи");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите описание задачи: ");
            String description = scanner.nextLine();

            System.out.print("Введите срок выполнения задачи: ");
            String dueDate = scanner.nextLine();

            System.out.print("Введите приоритет задачи: ");
            String priority = scanner.nextLine();

            JSONObject newTask = new JSONObject();
            newTask.put("описание", description);
            newTask.put("срок", dueDate);
            newTask.put("приоритет", priority);
            jsonArray.add(newTask);

            JSONObject taskTracker = new JSONObject();
            taskTracker.put("задачи", jsonArray);

            try (FileWriter file = new FileWriter("src/lr8/Example6/задачи.json")) {
                file.write(taskTracker.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
