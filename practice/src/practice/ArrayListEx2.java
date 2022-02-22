package practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 10;			//자르려는 글자 개수 지정
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();	//43
		
		List list = new ArrayList(length/LIMIT + 10);
		// 지정 크기보다 더 많은 객체를 저장하면 자동적으로 크기가 늘어나지만
		//이 과정에서 처리시간이 많이 소요되므로 여유있게 지정하는 것이 좋다.
		for(int i = 0; i<length; i+=LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		
		
		for(int i = 0; i<list.size();i++)
			System.out.println(list.get(i));
//		0123456789
//		abcdefghij
//		ABCDEFGHIJ
//		!@#$%^&*()
//		ZZZ
	}

}
