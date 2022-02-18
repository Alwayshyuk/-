package loop;

import java.lang.*;

public class Test05 {

	public static void main(String[] args) {
		
		//1부터 100사이의 홀수를 출력
		//(1) 1부터 100이하인 경우 2씩 증가하도록 반복 구성.
		for(int i =1; i<=100; i+=2)
			System.out.println("i = " +i);
		
		
		System.out.println("---------");
		//(2) 1부터 100이하인 경우 1씩 증가하도록 반복 구성 + 홀수 조건
		for(int i =1; i<=100; i++) 
			if(i % 2 == 1)
				System.out.println("i = "+ i);
		
	}

}