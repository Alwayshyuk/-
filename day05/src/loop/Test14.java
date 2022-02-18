package loop;

import java.lang.*;

public class Test14 {

	public static void main(String[] args) {
		
		int firstPush = 10;
		int totalPush = 0;
		
		for(int i = 0; i<30; i++) {
			
			totalPush += firstPush;
			firstPush +=3;
		}
		
			System.out.println("Çª½¬¾÷À» ÃÑ" + totalPush + "°³ Çß³×¿ä");
	}

}