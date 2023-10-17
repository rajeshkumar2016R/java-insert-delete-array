import java.util.Scanner;

public class delete_one_element {

	public static void main(String[] args) {
		
		int n,m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of array: ");
		n = s.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n-1];
		
		System.out.println("Enter values: ");
		
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt() ;  
		}
		
		System.out.println("Enter index to delete: ");
		m = s.nextInt();
		
		for(int i=0; i<a.length; i++) {
			if(i < m)
			{
				b[i] = a[i];
			} 
			else if(i == m)
			{
				continue;
			}
			else 
			{
				b[i-1] = a[i];
			}
		}
		System.out.print("Elements are: ");
		
		for(int i=0; i<n-1; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
