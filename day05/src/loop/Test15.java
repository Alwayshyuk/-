package loop;

import java.lang.*;

public class Test15 {

	public static void main(String[] args) {
		
		long startMoney = 1;
		long firstEndMoney = 0;
		long secondEndMoney = 0;
		
		for(int i =1; i<=30; i++) {
			System.out.printf("%d일차 %d전 입니다.\n",i, startMoney);
			firstEndMoney += startMoney;
			startMoney *= 2;
		}
		System.out.printf("30일 동안 받을 금액은 %d전 입니다.",firstEndMoney);
		
		for(int i = 31; i<=40; i++) {
			secondEndMoney += firstEndMoney;
			firstEndMoney *= 2;
		}
		
		
		System.out.printf("40일 동안 받을 금액은 %d전 입니다.",secondEndMoney);
	}

}