/*
 * 2022-02-13 00:09
 * 자바의 정석 연습문제 8-8
 */

package E8;

import java.util.Scanner;

public class E8_8 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
			count ++;
			System.out.println("1~100 plz : ");
			
			try{input = new Scanner(System.in).nextInt();}
			catch(Exception e) {
				System.out.println("numer plz");
				continue;
			}
			
			if(answer>input) {
				System.out.println("more big");
			} else if(answer < input) {
				System.out.println("more small");
			}else {
				System.out.println("good");
				System.out.println("try : "+count);
				break;
			}
		} while(true);

	}

}
