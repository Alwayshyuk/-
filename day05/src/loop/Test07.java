package loop;

import java.lang.*;

public class Test07 {

	public static void main(String[] args) {

		// 369����
		// 369���� ¦ 1���� 100����

		for (int i = 1; i <= 100; i++) {

			boolean isT = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			boolean isTen = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;

			if (isT)
				if (isTen)
					System.out.println(i + "¦¦");
				else
					System.out.println(i+"¦");
			else if (isTen)
				System.out.println(i + "¦");
			else
				System.out.println(i);

		}
	}

}