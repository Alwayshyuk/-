package loop;

import java.lang.*;

public class Test09 {

	public static void main(String[] args) {
		//반복문을 이용한 카운트 측정
		//ex: 1부터 100까지의 홀수 개수 구하기
		int n = 0;
		
		for(int i =1; i<=100; i++)
			if(i%2 ==1)
				n++;
		
		System.out.println(n);
	}

}