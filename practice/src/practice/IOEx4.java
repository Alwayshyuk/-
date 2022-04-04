package practice;

import java.io.*;
import java.util.Arrays;

public class IOEx4 {
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		byte[] tmp = new byte[4];

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		try {
			while (input.available() > 0) {
				int len = input.read(tmp); // 읽어 온 데이터 개수를 반환한다.
				output.write(tmp, 0, len); // 읽어 온 만큼만 write한다.
			}
		} catch (IOException e) {}
		
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(tmp));
		System.out.println(Arrays.toString(outSrc));
	}
}
