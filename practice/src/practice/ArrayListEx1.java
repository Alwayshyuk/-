package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
//		list1: [5, 4, 2, 0, 1, 3]
//		list2: [4, 2, 0]
						
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
//		list1: [0, 1, 2, 3, 4, 5]
//		list2: [0, 2, 4]

		
		System.out.println("list1.containsAll(list2): "+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
//		list1.containsAll(list2): true
//		list1: [0, 1, 2, 3, 4, 5]
//		list2: [0, 2, 4, A, B, C]
				
		System.out.println("list1.retainAll(list2):  " + list1.retainAll(list2));
		print(list1, list2);
//		list1.retainAll(list2):  true
//		list1: [0, 2, 4]
//		list2: [0, 2, 4, A, B, C]
				
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		//만일 변수i를 증가시켜가면서 삭제하면, 한 요소가 삭제될 때마다 빈 공간을 채우기 위해
		//나머지 요소들이 자리이동을 하기 때문에 올바른 결과를 얻을 수 없다.
		print(list1, list2);
//		list1: [0, 2, 4]
//		list2: [A, B, C]

		
		
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: "+list1 );
		System.out.println("list2: "+list2 );
		System.out.println();
	}

}
