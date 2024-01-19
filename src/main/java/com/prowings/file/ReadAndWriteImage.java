package com.prowings.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteImage {
	
	public static void main(String[] args) {
		
		try {
		    FileInputStream fin=new FileInputStream(new File("C:\\Users\\Shree\\Desktop\\TimeComplexity.png")); 
		    FileOutputStream fout=new FileOutputStream(new File("newimg.jpeg"));

		        int content;
		        while ((content = fin.read()) != -1) {
		            fout.write(content);
		         }

		        System.out.println("Finished");
		    } catch (IOException e) {
		        e.printStackTrace();
		    } 
		
	}

}
