package lr8.task2;

import java.io.File;
import java.util.stream.IntStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.Scanner;

public class TaskSearch {
    public static void searchByDescription(String description) {
        try {
            File inputFile = new File("src/lr8/Example5/задачи.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("задача");
            System.out.println("Список задач с описанием " + description + ":");

            IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> element
                            .getElementsByTagName("описание")
                            .item(0)
                            .getTextContent()
                            .equals(description))
                    .forEach(element -> {
                        System.out.println("Описание задачи: " + element
                                .getElementsByTagName("описание")
                                .item(0)
                                .getTextContent());
                        System.out.println("Срок выполнения: " + element
                                .getElementsByTagName("срок")
                                .item(0)
                                .getTextContent());
                        System.out.println("Приоритет: " + element
                                .getElementsByTagName("приоритет")
                                .item(0)
                                .getTextContent());
                        System.out.println();
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для поиска введите описание задачи: ");
        String searchDescription = scanner.nextLine();
        searchByDescription(searchDescription);
    }
}
