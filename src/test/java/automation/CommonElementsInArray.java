package automation;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer[] ar= {1,2,3,4,5};
		Integer[] ar2={1,2,3,8,};
		Integer[] ar3={1,2,9,4,5};
		
		
		Set<Integer> set1= new HashSet<>(Set.of(ar));
		Set<Integer> set2= new HashSet<>(Set.of(ar2));
		Set<Integer> set3= new HashSet<>(Set.of(ar3));
		
		
		set1.retainAll(set2);
		set1.retainAll(set3);
		
		System.out.println(set1);
		
		System.out.println(set1);
		
 
	}

}
