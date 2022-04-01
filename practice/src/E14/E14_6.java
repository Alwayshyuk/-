package E14;

import java.util.Random;

public class E14_6 {

	public static void main(String[] args) {
		new Random().ints(1,46)
			.distinct()
			.limit(6)
			.sorted()
			.forEach(System.out::println);

	}

}
