package main;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.omg.Messaging.SyncScopeHelper;



public class HTMLWordsArray {
	public String[] htmlArray;  
	
	Document doc = Jsoup.connect(urlString).get(); //urlString is each line of the url.txt
	
	String text = doc.body().text(); //take away body() ?? 
	text = text.toLowerCase(); 
	text = text.replaceAll("[^a-z]", " ").trim();  
	
	List<String> htmlList = Arrays.asList(text.split("\\s+")); 	
	List<String> list = new ArrayList<String>();
	htmlArray = htmlList.toArray(new String[0]); 
	
		for (String stuff : htmlArray) { 
		System.out.println(stuff); 
	}
	
//	delete ). , 
	
	} 
} 

	
//	for (String stuff : html1) {
//		System.out.println(stuff);


		
	//Make array from string
	    //separate by spaces
	
	
	//Maybe narrow down array? 
		//no special characters 
		//no repeated words
		//
		
	
	
	

