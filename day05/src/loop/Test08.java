package loop;

import java.lang.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test08 {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���.> ");
		int m = s.nextInt();
		System.out.println("�ʸ� �Է��ϼ���.> ");
		int se = s.nextInt();
		s.close();
		
		for(int i = m; i>=0; i--) {
			for(int j = se; j>=0; j--) {
				System.out.printf("%d�� %d�� �� �˶��� �︳�ϴ�.\n",i,j);
//				Thread.sleep(1000);
//				TimeUnit.SECONDS.sleep(1);
			}
			se=59;
		}
		
		System.out.println("��������~");
	}

}
