package jsoup;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UseJsoup {
	public static Iterator<Element> searchPageURL(String name) throws IOException{
		
		Document doc = Jsoup.connect(name).userAgent("Mozilla/5.0").get(); // �n�ϥ�userAgent�~���|error
		Elements links = doc.select("h3.r > a ");// ���X�֦�href�ݩʪ�<h3 class="r"...
		Iterator<Element> it = links.iterator();
		
		return it;
	}
}
