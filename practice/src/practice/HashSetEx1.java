package practice;

import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {

		Object[] arr = {"1", new Integer(1), "2", "2", "3", "3", "4","4","4"};
		Set set = new HashSet();
		
		for(int i = 0; i<arr.length; i++) {
			set.add(arr[i]);				//HastSet에 arr 요소들을 저장한다.
		}
		System.out.println(set);			//[1,1,2,3,4}
	}
}
