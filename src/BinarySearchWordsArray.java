package main;

import java.util.*; 

public class BinarySearchWordsArray {

	HTMLWordsArray hwa = new HTMLWordsArray();
	String[] html = hwa.htmlArray;
	LinkedList<String> matchedWords;   

	for (int i = 0; i < html.length; i++) {
		   	
		   	String key = html[i];  
	        int max= (html.length -1);
	        int min = 0; 
	       
	        binarySearch(wordsArray, key);
		}
		  
		  
private void binarySearch(String[] array, String key) {
	       
		int min = 0; 
		int max = array.length;
		
	                                      
	    while (min <= max) {
	         int i = (min + max) / 2;
	         if (array[i].compareTo(key) < 0) {
	                min = i + 1;
	            } else if (array[i].compareTo(key) > 0) {
	                max = i - 1;
	            } else {
	                matchedWords.add(key); 
	                
	            }
	        }    
		    		 
	}


		 
	 
	
	}
}
