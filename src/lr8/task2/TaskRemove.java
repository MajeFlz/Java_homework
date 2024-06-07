package lr8.task2;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class TaskRemove {
    public static void removeTask(String description) {
        try {
            File inputFile = new File("src/lr8/Example5/задачи.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("задача");
            boolean taskRemoved = false;
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String taskDescription = element
                            .getElementsByTagName("описание")
                            .item(0)
                            .getTextContent();
                    if (taskDescription.equals(description)) {
                        doc.getDocumentElement().removeChild(node);
                        System.out.println("Задача с описанием \"" + description + "\" была успешно удалена.");
                        taskRemoved = true;
                        break; // Удаляем только первую найденную задачу
                    }
                }
            }

            if (!taskRemoved) {
                System.out.println("Задача с описанием \"" + description + "\" не найдена.");
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr8/Example5/задачи.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        removeTask("Закончить отчет по проекту");
    }
}
