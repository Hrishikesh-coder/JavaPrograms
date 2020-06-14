import java.util.Scanner;

public class ArraySort {
	
	public static void main(String[] a) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms in your array : ");
		int n = sc.nextInt();
		
		int b[] = new int[n];
		
		for(int j = 0;j<n;j++) {
			
			System.out.println("Enter the term:");
			int c = sc.nextInt();
			b[j] = c; 
		}
		
		int m = 0 ; 
		
		for(int k=1;k<n;k++) {
			for(int l=k;l>0;l--) {
				if(b[k-1]>b[k]) {
					int copy = b[k];
					b[k] = b[k-1];
					b[k-1] = copy ; 
				}
			}
		}
		
		for(int h : b) {System.out.println(h);}
	}

}
