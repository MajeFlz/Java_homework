package lr8.task3;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Task3 {
    public static void main(String[] args) {
        JSONObject task_tracker = new JSONObject();
        JSONArray tasks = new JSONArray();

        JSONObject task1 = new JSONObject();
        task1.put("описание", "Закончить отчет по проекту");
        task1.put("срок", "2024-06-10");
        task1.put("приоритет", "Высокий");

        JSONObject task2 = new JSONObject();
        task2.put("описание", "Подготовиться к встрече");
        task2.put("срок", "2024-06-12");
        task2.put("приоритет", "Средний");

        tasks.add(task1);
        tasks.add(task2);

        task_tracker.put("задачи", tasks);

        try (FileWriter file = new FileWriter("src/lr8/Example6/задачи.json")) {
            file.write(task_tracker.toJSONString());
            System.out.println("Json файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
