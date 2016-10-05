package Exeption;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExeptionExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		/*This constructor FileInputStream(File filename)
		 * throws FileNotFoundException which is a checked
		 * exception*/
	        fis = new FileInputStream("B:/myfile.txt"); 
		int k; 

		/*Method read() of FileInputStream class also throws 
		 * a checked exception: IOException*/
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 

		/*The method close() closes the file input stream
		 * It throws IOException*/
		fis.close(); 	
	}
//	Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//		Unhandled exception type FileNotFoundException
//		Unhandled exception type IOException
//		Unhandled exception type IOException
//
//		at Exeption.ExeptionExample.main(ExeptionExample.java:19)
}
