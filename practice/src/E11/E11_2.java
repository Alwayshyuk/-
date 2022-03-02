package E11;
import java.util.*;
public class E11_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list);	//중복 허용 안함, 순서유지 안됨. 2 3 6 7
		TreeSet tset = new TreeSet(set);	//오름차순으로 정렬됨. 2 3 6 7
		Stack stack = new Stack();			//Stack에 넣었다 꺼내면 저장순서가 반대가 된다.
		stack.addAll(tset);					//FILO구조
		
		while(!stack.empty())
			System.out.println(stack.pop()); //stack에 저장된 값을 하나식 꺼낸다. 7 6 3 2
	}

}
