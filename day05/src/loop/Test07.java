package loop;

import java.lang.*;

public class Test07 {

	public static void main(String[] args) {

		// 369°ÔÀÓ
		// 369¿¡¼­ Â¦ 1ºÎÅÍ 100±îÁö

		for (int i = 1; i <= 100; i++) {

			boolean isT = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			boolean isTen = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;

			if (isT)
				if (isTen)
					System.out.println(i + "Â¦Â¦");
				else
					System.out.println(i+"Â¦");
			else if (isTen)
				System.out.println(i + "Â¦");
			else
				System.out.println(i);

		}
	}

}