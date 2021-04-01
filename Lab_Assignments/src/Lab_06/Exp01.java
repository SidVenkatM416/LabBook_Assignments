package Lab_06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exp01 {
	
	public static List<String> getValues(HashMap<String, String> ee) {
		 List<String> mm=new ArrayList<>();
		 Collection<String> list=ee.values();
		 mm.addAll(list);
		 Collections.sort(mm);
		 return mm;
	}
	public static void main(String[] args) {
		 HashMap<String, String> ee = new HashMap<>();
		 ee.put("sid", "21");
		 ee.put("sidhu", "20");
		 ee.put("sidharth", "6");
		 ee.put("siddd", "11");
		 System.out.println(getValues(ee));
		

	}

}
