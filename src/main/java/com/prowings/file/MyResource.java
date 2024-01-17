package com.prowings.file;

public class MyResource implements AutoCloseable  {

	@Override
	public void close() throws Exception {
		
		System.out.println("Close method invoked on MyResource!!");
		
	}
	
	

}
