import java.util.*;

public class Menu1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---MENU----");
		System.out.println("1.CHECK IF A NUMBER IS SPECIAL OR NOT");
		System.out.println("2.PRINT THE SERIES 0,3,7,15,24...UPTO N TERMS");
		System.out.println("3.PRINT THE SUM OF THE SERIES 1/2,3/4,...,19/20");
		System.out.println("4.PRINT THE FIRST 10 TERMS OF THE FIBONACCI SERIES");
		System.out.println("Enter an appropriate choice:");
		
		int n = sc.nextInt();
		
		switch(n) {
		
		case 1:
			
			System.out.println("Enter the number");
			int x = sc.nextInt();
			int copy = x ;
			
			int sum = 0 ; 
			
			while(copy != 0) {
				
				int r = copy%10;
				
				int f = 1 ; 
				
				for(int i = 1 ;i<=r;i++ ) {
					
					f*=i ; 
					
				}
				
				sum+=f ; 
				
				copy/=10 ; 
			}
			
			if(sum==x) {
				System.out.println("Strong Number");
			}
			
			else {
				System.out.println("Not A Strong Number");
			}
			
			break ; 
			
		case 2:
			
			int a = 0 ; 
			int b = 3 ; 
			System.out.println("Enter the number of terms :");
			
			int t = sc.nextInt();
			
			for(int i=1;i<=t;i++) {
				
				System.out.println(a);
				a+=b;
				if(i%2==0) {
					b*=2 ; 
				}
				else {
					b+=1 ; 
				}
				
				
			}
			
			break ; 
			
		case 3:
			
			double s = 0.0 ;
			
			for(int i=1;i<=19;i++) {
				int j = i+1; 
				s=s+((double)i/j) ;
				
			}
			
			System.out.println(s);
		
			break ; 
		case 4:
			
			int c = 0 ; 
			int d = 1 ;
			
			System.out.println(c);
			System.out.println(d);
			
			int e = c+d ; 
			
			for(int i=1;i<=8;i++) {
				
				e = c + d ; 
				c = d ; 
				d = e ; 
				System.out.println(e);
			}
			break ; 
	}
			
	}
	
}


