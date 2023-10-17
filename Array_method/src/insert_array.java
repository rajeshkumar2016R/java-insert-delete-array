import java.util.Scanner;

public class insert_array {

	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of element:  ");
		n = s.nextInt();
		
		int a[] = new int[n]; 
		System.out.println("Enter your value: ");
		for(int i=0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Elements are: ");
		for(int i=0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	}
	

}
