package loop;

import java.lang.*;

public class Test09 {

	public static void main(String[] args) {
		//�ݺ����� �̿��� ī��Ʈ ����
		//ex: 1���� 100������ Ȧ�� ���� ���ϱ�
		int n = 0;
		
		for(int i =1; i<=100; i++)
			if(i%2 ==1)
				n++;
		
		System.out.println(n);
	}

}