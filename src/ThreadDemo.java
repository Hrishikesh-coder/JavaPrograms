class A extends Thread{
	
	public void run() {
		
		for(int i=1 ;i<=5;i++) {
			
			System.out.println("Hello");
			try {Thread.sleep(5000);}catch(Exception e) {}
		}
		
	}
	
}

class B extends Thread{
	
	public void run() {
		
		for(int i=1 ;i<=5;i++) {
			
			System.out.println("HI");
			try {Thread.sleep(5000);}catch(Exception e) {}
		}
		
	}
	
}

public class ThreadDemo {
	public static void main(String[] a)throws Exception {
		
		A obj = new A();
		B obj1 = new B();
		
		obj.start();
		try {Thread.sleep(100);}catch(Exception e) {}
		obj1.start();
	}
}
