package lr8.task2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Task2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("задачи");
            doc.appendChild(rootElement);

            Element task1 = doc.createElement("задача");
            rootElement.appendChild(task1);

            Element description1 = doc.createElement("описание");
            description1.appendChild(doc.createTextNode("Закончить отчет по проекту"));
            task1.appendChild(description1);

            Element dueDate1 = doc.createElement("срок");
            dueDate1.appendChild(doc.createTextNode("2024-06-10"));
            task1.appendChild(dueDate1);

            Element priority1 = doc.createElement("приоритет");
            priority1.appendChild(doc.createTextNode("Высокий"));
            task1.appendChild(priority1);

            Element task2 = doc.createElement("задача");
            rootElement.appendChild(task2);

            Element description2 = doc.createElement("описание");
            description2.appendChild(doc.createTextNode("Подготовиться к встрече"));
            task2.appendChild(description2);

            Element dueDate2 = doc.createElement("срок");
            dueDate2.appendChild(doc.createTextNode("2024-06-12"));
            task2.appendChild(dueDate2);

            Element priority2 = doc.createElement("приоритет");
            priority2.appendChild(doc.createTextNode("Средний"));
            task2.appendChild(priority2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new StreamResult(
                    new File("src/lr8/Example5/задачи.xml")
            );
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
