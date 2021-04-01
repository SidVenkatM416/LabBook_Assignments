package Lab_06;

import java.util.HashMap;
import java.util.Set;

public class Exp04 {
	 public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
     {
            HashMap<String,String> medal = new HashMap<>();
            Set<String> set = stu.keySet();
            for(String s:set)
            {
                   Integer marks = stu.get(s);
                   if(marks>=90)
                   {
                         medal.put(s,"Gold");
                   }
                   else if(marks >=80)
                   {
                         medal.put(s,"Silver");
                   }
                   else if(marks>=70)
                   {
                         medal.put(s,"Bronze");
                   }
            }
            return medal;
     }

	public static void main(String[] args) {
		 
		HashMap<String,Integer> stu = new HashMap<>();
         Exp04 p = new Exp04();
         stu.put("Sid",66);
         stu.put("sidhu",79);
         stu.put("sidharth",99);
         stu.put("sidvenkat",93);
         stu.put("siddd",92);
         System.out.println(p.getStudent(stu));
	}

}
