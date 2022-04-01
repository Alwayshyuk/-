package E14;

import java.util.Comparator;
import java.util.stream.Stream;

public class E14_5 {

	public static void main(String[] args) {
		String[] strArr =  { "aaa","bb","c", "dddd" };
		
		Stream<String> str = Stream.of(strArr);
		str.map(String::length)
		.sorted(Comparator.reverseOrder())
		.limit(1)
		.forEach(System.out::println);
		

	}

}
