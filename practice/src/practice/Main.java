package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for(int i = 0 ; i<9; i++) {
			int b=s.nextInt();
			list.add(b);
		}
		System.arraycopy(list, 0, list2, 0, 8);
		
		list2.sort(null);
		System.out.print(list.indexOf(list2.get(8)));
	}

}
