package practice;

import java.util.*;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(20000000);
		LinkedList ll = new LinkedList();
		
		System.out.println("순차적 추가");
		System.out.println(add1(al));		//188
		System.out.println(add1(ll));		//223
		
		System.out.println("중간에 추가");
		System.out.println(add2(al)); 		//2823
		System.out.println(add2(ll)); 		//15
		
		System.out.println("중간에서 삭제");
		System.out.println(remove2(al));	//2185
		System.out.println(remove2(ll));	//141
		
		System.out.println("순차적 삭제");	
		System.out.println(remove1(al));	//11
		System.out.println(remove1(ll));	//38

	}
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<1000000; i++) list.add(i+"");
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<10000; i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		return end  - start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i = list.size()-1; i>=0; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<10000; i++) list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

}
