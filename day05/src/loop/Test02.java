package loop;

import java.lang.*;

public class Test02 {

	public static void main(String[] args) {
		// 반복: 동일하거나 유사한 작업을 지속적으로 수행하는 것.

		// ex : 화면에 hello를 10번 출력하세요

		// for(10번)
		// for(1 ; 2 ; 3)
		// for(0부터 시작 ; 10미만이면 실행 ; 1씩 증가)

		for (int n = 0; n < 10; n = n + 1) {
			System.out.println("hello" + n);
		}
	}

}
