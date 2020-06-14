import java.util.*;
public class Automorphic {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int x = n ; 
	
		
		int k = 0 ;
		while(x>0) {

			x = x/10;
			k++;
			
		}
		
		double sq = Math.pow(n,2) ; 
		
		
			
		int r = (int)(sq % Math.pow(10, k));
					
			
		if (r==n) {
			System.out.println("Automorphic no.");
		}
		
		else {
			System.out.println("Not a Automorphic No.");
		}
		
	}
}
