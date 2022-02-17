package loop;

import java.lang.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test08 {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);

		System.out.print("분을 입력하세요.> ");
		int m = s.nextInt();
		System.out.println("초를 입력하세요.> ");
		int se = s.nextInt();
		s.close();
		
		for(int i = m; i>=0; i--) {
			for(int j = se; j>=0; j--) {
				System.out.printf("%d분 %d초 후 알람이 울립니다.\n",i,j);
//				Thread.sleep(1000);
//				TimeUnit.SECONDS.sleep(1);
			}
			se=59;
		}
		
		System.out.println("따르르릉~");
	}

}
