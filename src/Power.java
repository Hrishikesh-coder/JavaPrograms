
public class Power {
	
	public static int power(int n,int m){
		
		int c = 1; 
		for(int i=1;i<=m;i++) {
			
			c*=n ; 
			
		}
		
		return c ; 
	}
	
	
	public static void main(String a[]){
		
		int g = power(3,3);
		System.out.print(g);
		
	}

}

//int temp; 
//
// for (int i = 1; i < n; i++) {
//	    for (int j = i; j > 0; j--) {
//	     if (b[j] < b[j - 1]) {
//	      temp = b[j];
//	      b[j] = b[j - 1];
//	      b[j - 1] = temp;
//	     }
//	    }
//	   }
//for(int h : b) {System.out.println(h);}