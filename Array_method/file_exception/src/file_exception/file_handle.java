package file_exception;

public class file_handle {

	public static void main(String[] args) {
		System.out.println("Exception handled");
		int a=10,b=0,c;
		try {
			c = a/b;
			System.out.print(c);
		}
		catch(Exception e){
			System.out.println("can't divide by zero");
		}
		System.out.println("Exception Endeedd");
	}

}
