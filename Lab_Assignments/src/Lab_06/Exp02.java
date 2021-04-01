package Lab_06;

import java.util.HashMap;
import java.util.Map;

public class Exp02 {
	
	public void register(char c[]) {
		Map<Character,Integer> me =new HashMap<>();
		for(char c1:c) {
			if(me.containsKey(c1)) {
				int a=me.get(c1);
				me.put(c1,a+1);
			}
			else {
				me.put(c1,1);
			}
		}
		System.out.println(me);
	}

	public static void main(String[] args) {
		
		String str="sidharthvenkat";
		char arr[]=str.toCharArray();
		Exp02 obj=new Exp02();
		obj.register(arr);

	}

}
