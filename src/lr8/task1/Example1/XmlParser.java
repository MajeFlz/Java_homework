package lr8.task1.Example1;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


public class XmlParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr8/Example1/example1.xlm");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.printf("Корневой элемент: %s\n", doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.printf("\nТекущий элемент: %s\n", node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String title = element
                            .getElementsByTagName("title")
                            .item(0).getTextContent();
                    String author = element.getElementsByTagName("author").item(0)
                            .getTextContent();
                    String year = element
                            .getElementsByTagName("year")
                            .item(0)
                            .getTextContent();
                    System.out.printf("Название книги: %s\n", title);
                    System.out.printf("Автор: %s\n", author);
                    System.out.printf("Год издания: %s\n", year);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
