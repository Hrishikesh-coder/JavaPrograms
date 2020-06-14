import java.util.*;

public class Collectioncon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// collection -> Concept
		//Collection ->Interface
		//Collections -> Class
		int a[] = new int[4];
//		Random r = new Random();
//		int x = r.nextInt();
		Collection<Integer> v = new ArrayList();//no need of mentioning parameter after class name if JDK is >1.7		
		v.add(5);
		v.add(6);
		//v.add("Navin");
		List<Integer> x = new ArrayList();
		x.add(5);
		x.add(6);
		x.add(1, 8);
		Set<Integer> y = new HashSet();
		Set<Integer> z = new TreeSet();
		Map<Integer , Integer> m = new HashMap();
		
		System.out.println(v);
	
		System.out.println(x);
	}

}
