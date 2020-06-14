import java.util.Scanner;

public class Project {

public static String isPrime(int no) {
	
	int c=0;
	for(int i=1;i<=no;i++) {
		
		if(no%i==0)
			c++;
		else {}
		
	}
	
	if(c==2) {
		
		return no+" is Prime";
		
	}
	
	return no+" is not Prime";
	
}

public static void main(String[] a) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
	
	System.out.println(isPrime(n));
	
}

}
