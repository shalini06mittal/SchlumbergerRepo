package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// windows
		//File file = new File("C:\\Desktop\\test.txt");
		
		File file = new File("test.txt");
//		System.out.println(file.exists());
//		System.out.println(file.createNewFile());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.length());
//		System.out.println(file.lastModified());
//		
//		File file1 = new File("/Users/Shalini/Desktop/test.txt");
//		System.out.println(file1.createNewFile());
//		System.out.println(file1.getAbsolutePath());
//		System.out.println(file1.length());
//		System.out.println(file1.lastModified());
//		
//		FileWriter writer = new FileWriter("demo.txt", true);
//		writer.write("Bye there\n");
//		writer.write("Welcome there\n");
//		writer.close();
		
		
		FileReader reader = new FileReader(file);// file -> test.txt
		// scanner is asynchronous hence fast
		Scanner sc = new Scanner(reader);
		/**
		 * next() => to read a single word. It stops reading at the space
		 * nextLine() => to read a sentence. It stops reading at the newline(\n)
		 */
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
		
		System.out.println();
		
		reader = new FileReader(file);
		// buffered reader is synchronous hence slow, faster
		BufferedReader bufferedReader = new BufferedReader(reader);
		String s = "";
		while( true) {
			s = bufferedReader.readLine();
			
			if(s==null) break;
			System.out.println(s);
		}
		bufferedReader.close();
		reader.close();
//		
	}

}
