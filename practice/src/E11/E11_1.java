package E11;
import java.util.*;
public class E11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hab = new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		hab.addAll(list1);
		hab.addAll(list2);
		
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(kyo);
		System.out.println(cha);
		System.out.println(hab);
	}

}
