package Lab_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exp06 {
	
	public static List<Integer> votersList(Map<Integer,Integer> k) {
		List<Integer> li=new ArrayList<>();
		Set<Integer>s=k.keySet();
		for(int i:s) {
			if(k.get(i)>=18) {
				li.add(i);
			}
		}
		return li;
	}

	public static void main(String[] args) {
		
		Map<Integer,Integer> ba =new HashMap<>();
		ba.put(16,9);
		ba.put(15,38);
		ba.put(11,89);
		ba.put(24,78);
		ba.put(19,8);
		ba.put(35, 39);
		System.out.println(votersList(ba));
	}

}
