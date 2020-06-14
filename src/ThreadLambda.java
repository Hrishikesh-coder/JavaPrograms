public class ThreadLambda {
	public static void main(String[] a)throws Exception {
		
		Thread t1 = new Thread(() -> {
			
			
				
				for(int i=1 ;i<=5;i++) {
					
					System.out.println("Hello");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
				});
		
Thread t2 = new Thread(()
			->{
			
			
				
				for(int i=1 ;i<=5;i++) {
					
					System.out.println("HI");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
				
			
			
		});
		
		
		t1.start();
		try {Thread.sleep(100);}catch(Exception e) {}
		t2.start();
	}
}