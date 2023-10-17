package file_exception;

import java.io.*;

public class operation {

	public static void main(String[] args) throws Exception{
		
		File f = new File("C:\\Users\\rrraj\\Desktop\\raj");
			
			if(f.createNewFile()) {
				System.out.print("file created");
			}
			else 
			{
				System.out.println("file already exist");
			
			FileWriter a = new FileWriter("C:\\Users\\rrraj\\Desktop\\raj");
			
				a.write("java program is the best language in the world...");
		
				a.close();
	
			System.out.println("successfully wrote in file...");
			
			FileReader r = new FileReader("C:\\Users\\rrraj\\Desktop\\raj");
			
		
				int i;
				while((i=r.read())!= -1) {
					System.out.print((char)i);
				}
	
				r.close();
			
		}

	}

}
