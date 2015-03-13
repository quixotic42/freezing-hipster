package main;

import java.util.*; 

public class BinarySearchWordsArray {

	HTMLWordsArray hwa   = new HTMLWordsArray();
	   
	    	 
	public static void main(String[] args) {
		  HTMLWordsArray hwa  = new HTMLWordsArray();
		  String[] html = hwa.htmlArray;
		  
		  
		  Readers r = new Readers(); 
		  String[] wordsArray = r.wordsArray; 
		  
	   for (int i = 0; i < html.length; i++) {
		   	
		   	String key = html[i];  
	        int lastElementPosition = (html.length -1);
	        int firstElementPosition = 0; 
	        
	      
	        Arrays.sort(wordsArray);
	        binarySearch (wordsArray, key); {
	      
	  }
	   
	 
public static void binarySearch(String[] array, String key) {
	       
	int min = 0; 
	int max = array.length;
	LinkedList<String> matchedWords;  
	
                                      
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
