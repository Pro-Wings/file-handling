package com.prowings.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Shree\\Documents\\workspace-new-springboot\\file-handling\\src\\main\\resources\\myfile.txt");
		
		FileReader fr = new FileReader(file);
		
		 int i;
	        while ((i = fr.read()) != -1)
	            System.out.print((char)i);
	}

}
