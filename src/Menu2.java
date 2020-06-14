import java.util.*;
public class Menu2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---MENU---");
		System.out.println("1.Find the sum of the series : 1/a2 + 4/a5 + 7/a8 + 10/a11...upto n terms");
		System.out.println("2.Find the smallest digit of an integer:"); 
		System.out.println("Enter your choice:");
		
		int ch = sc.nextInt();
		
		
		switch(ch) {
			
		case 1:
				
			
				int x = 2 , y = 1 ; 
				
				System.out.println("Enter a number:");
				
				int n = sc.nextInt();
				
				System.out.println("Enter the number of terms:");
				int v = sc.nextInt();
				
				double sum = 0 ; 
				
				for(int i=1;i<=v;i++) {
					
					sum+=(double)y/(Math.pow(n,x));
					x+=3 ; 
					y+=3 ; 
				}
				
				System.out.println(sum);
				
				break ; 
		
		case 2:
			
			System.out.println("Enter a number:");
			int no = sc.nextInt();
			
			int min = 10 ; 
			
			while(no!=0) {
				int r = no % 10 ; 
				if(min>r) {
					min = r ; 
				}
				no/=10 ; 
			}
			
			System.out.println("Smallest digit is :  " +min);
			
			break ; 
			
		}
	}

}
