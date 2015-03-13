package com.main.gamee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class VocabReader {

	public static String[] wordsArray;
	static List<String> words = new ArrayList<String>();
	static String token1;

	public static void main(String[] args) throws IOException {

		populateArray();
		printWords();
		System.out.println(wordsArray.length);  

		// List<String> words = new ArrayList<String>();
		// populateArray(vocabReader, inFile1, words);
		// System.out.println(wordsArray[wordsArray.length -1]);
		// System.out.println(wordsArray[0]);
		// System.out.println(getWordsArray(0));
	}



	public static Scanner openFileForReading() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("words.txt"))
			scanner = scanner.useDelimiter("\", *\""); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scanner;
	}

	public static String readWord(Scanner inFile) {
		token = inFile.next();
		token = token.replace("\"", "").trim();
		return token;
	}
	
	public static String[] populateArray() {
		Scanner inFile = openFileForReading();

		while (inFile.hasNext()) {
			token = readWord(inFile);
			words.add(token);
			wordsArray = words.toArray(new String[0]);
		}
		return wordsArray;
	}

	public static void printWords() {
		for (String string : wordsArray) {
			System.out.println(string);
		}
	}
}
