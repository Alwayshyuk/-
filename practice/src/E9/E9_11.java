package E9;

import java.util.Scanner;

public class E9_11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.printf("%d X %d = %d\n", i, j, i * j);

		
		System.out.println();
		}
	}
}