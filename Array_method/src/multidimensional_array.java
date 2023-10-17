import java.util.Scanner;

public class multidimensional_array {

	public static void main(String[] args) {
		
		int n,m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		n = s.nextInt();
		
		System.out.println("Enter number of columns: ");
		m = s.nextInt();
		
		int a[][] = new int[n][m];
		System.out.print("Enter values: ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
