package practice;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("123.txt");
		int data = 0;
		
		while((data=fis.read())!=-1) {
			char c = (char)data;
			System.out.println(c);
		}
	}
}
