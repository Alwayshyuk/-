package practice;
import java.util.*;
import java.util.Map.Entry;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Entry e =(Entry)it.next();
//			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + "," +  e.getValue());	//안자바,90 김자바,100 강자바,80 이자바,100
		}
		set = map.keySet();
		System.out.println(set);				//[안자바, 김자바, 강자바, 이자바]
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total = i.intValue();
		}
		System.out.println(total);						//100
		System.out.println((float)total/set.size());	//25.0
		System.out.println(Collections.max(values));	//100
		System.out.println(Collections.min(values));	//80
	}
}
