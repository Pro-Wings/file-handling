package com.prowings.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TryWithResourceEx {
	
	public static void main(String[] args) {
		
		try(MyResource resource = new MyResource();BufferedReader br = new BufferedReader(new FileReader(new File("abc.txt")));MyResource2 resource2 = new MyResource2();)
		{
			System.out.println("inside try block!!");
			throw new NullPointerException();
		}
		catch(Exception e) 
		{
			System.out.println("inside catch block!!");
		}
		
		
	}

}
