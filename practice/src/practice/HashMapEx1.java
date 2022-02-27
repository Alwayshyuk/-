package practice;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("id 입력: ");
			String id = s.nextLine().trim();
			
			System.out.print("비밀번호: ");
			String ps = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("없는 id");
				continue;
			}
			
			if(!(map.get(id)).equals(ps)) {
				System.out.println("password다시");
			}else
				System.out.println("good");
		}
	}
}
