package loop;

import java.lang.*;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long n = s.nextLong();
		s.close();
		String st = String.valueOf(n);
		int c = 0;
		
		for(int i = 0; i<st.length(); i++)
			if(st.charAt(i)=='7')
				c++;

		System.out.println(c);
		
		
		
		
		
		int co = 0;
		
		for(long i = n; i>0; i /= 10) {
			if(i % 10 == 7)
				co++;
		}
		System.out.println(co);
	}
}