package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		

		ArrayList list = new ArrayList();
		
		for(int i = 0; i<A ; i++) {
			int c = (int)(Math.random()*1000001);
			int B = (int) (Math.random()*2);
			if(B == 1) {
				c=-c;
			}
			list.add(c);
		}
		
		list.sort(null);
		System.out.println(list.get(0) + " " + list.get(A-1));
		
		s.close();

	}

}
