import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.HashMap<String,Integer>h=new java.util.HashMap<String,Integer>();
		h.put("thiru", 1);
		h.put("gopal", 3);
		h.put("gopal", 2);
		h.put("", 1);
		h.put("",2);
		h.put("thiru", 2);
		h.replace("Hello", 1);

		h.put("barathi" , null);
		h.put("tiru" , null);
		System.out.println(h);
		Set s =h.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
		}
		
		
		
		
		

	}

}
