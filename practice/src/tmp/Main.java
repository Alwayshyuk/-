package tmp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String a = s.next();
		char[] b = a.toCharArray();
		int c= 0;
		for(int i=0; i<b.length; i++) {
			int d = (int)b[i];
			if(d<68) {c+=3;}
			else if(d<71) {c+=4;}
			else if(d<74) {c+=5;}
			else if(d<77) {c+=6;}
			else if(d<80) {c+=7;}
			else if(d<84) {c+=8;}
			else if(d<87) {c+=9;}
			else {c+=10;}
		}
		System.out.println(c);
	}
}