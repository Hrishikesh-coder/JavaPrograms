
public class Pattern1 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					System.out.print(" * ");
				}
				else {
					System.out.print(" # ");
				}
			}
		
			System.out.println();
			
		}
		
	}

}
