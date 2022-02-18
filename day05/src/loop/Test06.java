package loop;

import java.lang.*;

public class Test06 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i<=100; i++)
			if(i <60 && i >= 50 || i%10 ==5)
				System.out.println(i);
		
		
		System.out.println("------------");
		
		
		for(int i =5; i<=50; i+= 10)
			System.out.println(i);
		for(int i = 50; i<60; i++)
			System.out.println(i);
		for(int i =65; i<=100; i+= 10)
			System.out.println(i);
	}

}