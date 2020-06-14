import java.util.*;
public class GCD {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers:");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double c = a % b ;
		
		if(c==0) {
			
			System.out.println(b);
			
		}
		
		else {
			while(c!=0) {
				
				a = b ;
				b = c ; 
				c = a % b ; 
			}
		System.out.println(b);
		}
		
	}

}
