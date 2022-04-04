package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("123.txt");
			FileOutputStream fos = new FileOutputStream("456.txt");
			
			int data = 0;
			while((data = fis.read())!=-1) {
				fos.write(data);
			}
			fis.close();
			fos.close();
		} catch (Exception e) {}
	}
}
