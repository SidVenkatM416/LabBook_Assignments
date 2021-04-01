package Lab_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exp07 {
		
	public static Object[] getSorted(int[] arr) {
		List<Integer> li =new ArrayList<>();
		for(int i:arr) {
			int r=0;
			while(i!=0) {
				int digit =i%10;
				r=r*10+digit;
				i/=10;
			}
			li.add(r);
		}
		Collections.sort(li);
		return li.toArray();
	}

	public static void main(String[] args) {
		
		int[] array= {16,7,89,6,26,80,9};
		Object obj[]=getSorted(array);
		for(Object o:obj) {
			System.out.println(o);
		}

	}

}
