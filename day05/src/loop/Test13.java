package loop;

import java.lang.*;
import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = 0;
		
		for(int i = 1; i<=10 ; i++) {
			System.out.print(i +"번째 더할 숫자를 입력하세요.>");
			a += s.nextInt();
		}
		s.close();
		System.out.println("총: " + a);
	
	}

}