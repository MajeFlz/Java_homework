package lr8.task1.Example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");
            List<Node> nodes = newsParent.get(0).childNodes();

            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    Element element = (Element) nodes.get(i);
                    String theme = element
                            .getElementsByClass("blocktitle")
                            .get(0)
                            .childNodes()
                            .get(0)
                            .toString();
                    String date = element
                            .getElementsByClass("blockdate")
                            .get(0)
                            .childNodes()
                            .get(0)
                            .toString();
                    System.out.printf("Тема: %s\n", theme);
                    System.out.printf("Дата : %s\n\n", date);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
