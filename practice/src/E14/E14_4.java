package E14;

import java.util.stream.Stream;

public class E14_4 {

	public static void main(String[] args) {
		String[] strArr = {"aaa","bb","c","dddd"};
		
		Stream<String> stream = Stream.of(strArr);
		int sum = stream.mapToInt(String::length).sum();
		
		System.out.println(sum);
	}

}
