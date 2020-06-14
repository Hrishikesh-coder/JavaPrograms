import java.util.*;
public class Diserium {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int copy = a ; 
		int k = 0 ;
		
		while(copy!=0) {
			
			copy/=10;
			k++;
			
		}
		int c = a ; 
		int sum = 0 ;
		

		while(c!=0) {
			
			int r = c%10 ;
			int s = (int)(Math.pow(r,k));
			sum += s ; 
			k--;
			c/=10 ; 
		}
		
	
		
		if(a==sum) {
			System.out.println("Diserium No.");
		}
		else {
			System.out.println("Not a Diserium No.");
		}
		
		}
		
		
	}


