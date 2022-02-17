package loop;

import java.lang.*;
import java.util.Objects;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		s.close();

		int count = 0;

		for (int i = 1; i < n; i++)
			if (n % i == 0)
				count++;

		if (count == 1)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}

}