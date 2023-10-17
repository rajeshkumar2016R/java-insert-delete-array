package file_exception;
import java.io.*;

public class fileWrite {

	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("C:\\Users\\rrraj\\Desktop\\raj");
			try {
				f.write("java program");
			}
			finally {
				f.close();
			}
			System.out.print("successfully created...");
		} catch(Exception e){
			System.out.print(e);
		}

	}

}
