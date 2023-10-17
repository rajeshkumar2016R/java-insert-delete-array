import java.util.Scanner;

public class insert_one_element {

	public static void main(String[] args) {
		int n,m,p;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of element:  ");
		n = s.nextInt();
		
		int a[] = new int[n]; 
		int b[] = new int[n+1];
		
		System.out.println("Enter your value: ");
		for(int i=0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		System.out.print("Enter Index to put in the array: ");
		m = s.nextInt();
		
		System.out.print("Enter value to put in the index: ");
		p = s.nextInt();
		
		for(int i = 0; i<n+1; i++) {
			if(i<m) {
				b[i] = a[i];
			} else if(i == m) {
				b[i] = p;
			} else {
				b[i] = a[i-1];
			}
		}
		System.out.println("Elements are: ");
		for(int i=0; i < n+1; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
