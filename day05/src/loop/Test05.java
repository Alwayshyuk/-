package loop;

import java.lang.*;

public class Test05 {

	public static void main(String[] args) {
		
		//1���� 100������ Ȧ���� ���
		//(1) 1���� 100������ ��� 2�� �����ϵ��� �ݺ� ����.
		for(int i =1; i<=100; i+=2)
			System.out.println("i = " +i);
		
		
		System.out.println("---------");
		//(2) 1���� 100������ ��� 1�� �����ϵ��� �ݺ� ���� + Ȧ�� ����
		for(int i =1; i<=100; i++) 
			if(i % 2 == 1)
				System.out.println("i = "+ i);
		
	}

}