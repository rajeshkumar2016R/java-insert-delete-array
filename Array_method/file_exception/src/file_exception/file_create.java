package file_exception;

import java.io.*;

public class file_create {

	public static void main(String[] args) throws Exception{
		File f = new File("C:\\Users\\rrraj\\Desktop\\rajesh");
		
		if(f.createNewFile()) {
			System.out.println("file created");
		} else {
			System.out.println("file already exist");
		}
		
		FileWriter wr = new FileWriter("C:\\Users\\rrraj\\Desktop\\rajesh");
		
		wr.write("Hello world");
		
		System.out.println("Successfully wrote in your file");
		
		wr.close();
		
		FileReader r = new FileReader("C:\\Users\\rrraj\\Desktop\\rajesh");
		
		int data = r.read();
		while(data != -1) {
			System.out.print((char)data);
			data = r.read();
		}
		r.close();
			

	}

}
