package com.prowings.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountFromFile {
	
	public static void main(String[] args) {
		
		BufferedReader reader = null;
   	    int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
		
        try {
			
			reader = new BufferedReader(new FileReader(new File("abc.txt")));
			
			String currentLine = reader.readLine();
			
			while(currentLine != null)
			{
				lineCount++;
				String[] words = currentLine.split(" ");
				
				wordCount += words.length;
				
				for (String word : words)
                {
                    charCount += word.length();
                }
                 
				currentLine = reader.readLine();
				
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error occured while reading the file!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error occured while reading the file!!");
			e.printStackTrace();
		}
        finally
        {
        	try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Error occured while closing the reader!!");
				e.printStackTrace();
			}
        }
        
        System.out.println("The total lines present in file :"+lineCount);
        System.out.println("The total words present in file :"+wordCount);
        System.out.println("The total characters present in file :"+charCount);
		
	}

}
