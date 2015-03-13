package com.gc.gamee.com.gc.gameevocablist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class URLReader {

	public static String getUrl() {

		File file = new File("url.txt");
		String line = null;

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());

		} catch (IOException e) {
			System.out.println("Unable to open file: " + file.toString());
		}
		return line;
	}
}
