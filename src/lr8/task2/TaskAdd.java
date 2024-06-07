package lr8.task2;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TaskAdd {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr8/Example5/задачи.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Описание задачи: ");
            String description = scanner.nextLine();

            System.out.print("Срок выполнения: ");
            String dueDate = scanner.nextLine();

            System.out.print("Приоритет: ");
            String priority = scanner.nextLine();

            Element root = doc.getDocumentElement();

            Element task = doc.createElement("задача");

            Element descriptionElement = doc.createElement("описание");
            descriptionElement.appendChild(doc.createTextNode(description));
            task.appendChild(descriptionElement);

            Element dueDateElement = doc.createElement("срок");
            dueDateElement.appendChild(doc.createTextNode(dueDate));
            task.appendChild(dueDateElement);

            Element priorityElement = doc.createElement("приоритет");
            priorityElement.appendChild(doc.createTextNode(priority));
            task.appendChild(priorityElement);

            root.appendChild(task);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr8/Example5/задачи.xml"));
            transformer.transform(source, result);

            System.out.println("Задача успешно добавлена!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
