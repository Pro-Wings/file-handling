package com.prowings.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class WriteAFileByManyWays {
	
	public static void main(String[] args) throws IOException {
		
		String dataToWrite = "Hello Java developers.. welcome to Pro Wings!!";
		String dataToWrite2 = "Hello world!!";
		String dataToWrite3 = "AAAAAAAAAAAA";
		String dataToWrite4 = "BBBBBBBBBBBB";
		
		writeFileUsingBufferedWriter(dataToWrite2);
		writeFileUsingPrintWriter(dataToWrite3);
		writeFileOutputStream(dataToWrite3);
		writeFileUsingRandomAccessFile(dataToWrite3);
		writeFileUsingFilesUtilityClass(dataToWrite4);
		
	}

	public static void writeFileUsingFilesUtilityClass(String dataToWrite3) throws IOException {
		
		Path path = Paths.get("pqr.txt");
		 byte[] strToBytes = dataToWrite3.getBytes();
		Files.write(path, strToBytes);
		System.out.println("finished");
	}

	public static void writeFileUsingRandomAccessFile(String dataToWrite3) throws IOException {
		
		 RandomAccessFile writer = new RandomAccessFile(new File("xyz.txt"), "rw");
		    writer.seek(3);
		    writer.writeInt(1);
		    writer.close();
		
	}

	public static void writeFileOutputStream(String dataToWrite3) {
		
		try(FileOutputStream fos = new FileOutputStream(new File("xyz.txt")))
		{
			
			byte[] bytes = dataToWrite3.getBytes();
			
			System.out.println(Arrays.toString(bytes));
			
			fos.write(bytes);
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found exception occurred!!");
			e.printStackTrace();
			
		} catch (IOException e1) {
			System.out.println("Some error occurred while writing file!!");
			e1.printStackTrace();
		}
		
	}

	public static void writeFileUsingBufferedWriter(String dataToWrite) throws IOException {
	
		
		BufferedWriter br = new BufferedWriter(new FileWriter(new File("pqr.txt"), true));
		
//		br.write(dataToWrite);
		br.append(' ');
		br.append(dataToWrite);
		br.close();

		System.out.println("Data written to file successfully!!");
		
	}

	public static void writeFileUsingPrintWriter(String dataToWrite) throws IOException {
		
		
		PrintWriter pr = new PrintWriter(new FileWriter(new File("pqr.txt"), true));
		
		pr.write(dataToWrite);
//		br.append(' ');
//		br.append(dataToWrite);
		pr.close();
		
		System.out.println("Data written to file successfully!!");
		
	}

}
