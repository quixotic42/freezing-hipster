package com.gc.gamee.com.gc.gameevocablist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {

		// public static void writeToFile() {
		String fileName = URLReader.getUrl();
		fileName = fileName.replace("//", "");
		fileName = fileName.replace(".", "");
		fileName = fileName.replace("?", "");
		fileName = fileName.substring(10);
		File scrappedFile = new File(fileName);

		try (BufferedWriter br = new BufferedWriter(
				new FileWriter(scrappedFile))) {
			br.write(scrappedFile.toString());
		} catch (IOException e) {
			System.out.println("Unable to open file: "
					+ scrappedFile.toString());
		}
	}
}
