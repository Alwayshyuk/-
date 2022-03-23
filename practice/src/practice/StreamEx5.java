package practice;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {

	public static void main(String[] args) {
		String[] strArr = {
				"Inheritaance", "Java", "Lambda", "stream",
				"OperatorDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		//Inheritaance	Java	Lambda	stream	OperatorDouble
		//IntStream	count	sum
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length() == 0);
		Optional<String> sWord = Stream.of(strArr)
					.filter(s->s.charAt(0) == 's').findFirst();
		System.out.println(noEmptyStr);	//true
		System.out.println(sWord.get());	//stream
		
		//Stream<String[]>을 IntStream으로 변환
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b)->a+1);
		int sum = intStream2.reduce(0, (a,b)->a+b);
		
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println(count);	//8
		System.out.println(sum);	//59
		System.out.println(max);	//OptionalInt[14]
		System.out.println(min);	//OptionalInt[3]
	}
}
