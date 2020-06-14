import java.util.*;
public class Amicable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum1 = 0 ; 
		int sum2 = 0 ; 
		for(int i=1;i<a;i++) {
			
			if(a%i==0) {sum1+=i;}
			
		}
		
		for(int j=1;j<b;j++) {
			if(b%j==0) {sum2+=j;}
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		
		if(sum1==b && sum2==a) {
			System.out.println("Amicable No.s");
		}
		else {
			System.out.println("Not Amicable No.s");
		}
		
	}

}
