package com.techment.practice;

public class StringProgram {
	
	  public static void main(String[] args) {    
	        
		  String string = "Hello welcome to india";    
	        int count = 0;    
	        int word; 
	        int character;
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }    
	         character=count;   
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + character);  
	        
	        for(int i = 0; i < string.length(); i++) { 
	        
	            if(string.charAt(i) == ' ')    
	                count++;    
	        }    
	        word=count-character+1;  
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of word in a string: " + word);    
	    }    
	    
	}     

