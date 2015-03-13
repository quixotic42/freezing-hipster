package com.gc.gamee.com.gc.gameevocablist;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTMLParser {
	URLReader url = new URLReader();

	public static void main(String[] args) {
		String line = URLReader.getUrl();
//		Parse URL
		Document doc = Jsoup.parse(line);
// Get bodytext
		String bodyText = doc.body().text();
	}

}
