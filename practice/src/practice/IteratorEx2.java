package practice;

import java.util.*;

public class IteratorEx2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);

		for(int i = 0 ; i<10; i++)
			original.add(i+"");
		
		Iterator it = original.iterator();
		
		while(it.hasNext())
			copy1.add(it.next());
		System.out.println(original);		//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(copy1);			//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		it = original.iterator();		//Iterator는 재사용이 안되므로, 다시 얻어와야 한다.
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		System.out.println(original);		//[]
		System.out.println(copy2);			//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	}
}
