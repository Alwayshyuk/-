package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		String line = "";
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println(isr.getEncoding());
			
			do {
				System.out.println("문장을 입력하세요. 마치려면 q");
				line = br.readLine();
				System.out.println("입력한 문장: "+line);
			} while(!line.equalsIgnoreCase("q"));
		} catch (IOException e) {}
	}
}
